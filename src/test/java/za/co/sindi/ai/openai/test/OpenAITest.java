/**
 * 
 */
package za.co.sindi.ai.openai.test;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import za.co.sindi.ai.openai.OpenAIClient;
import za.co.sindi.ai.openai.audio.AudioTranscriptionRequest;
import za.co.sindi.ai.openai.chat.ChatCompletionRequest;
import za.co.sindi.ai.openai.implementation.OpenAIClientImpl;
import za.co.sindi.ai.openai.models.ChatCompletion;
import za.co.sindi.ai.openai.models.ChatCompletionChunk;
import za.co.sindi.ai.openai.models.ChatRequestMessage;
import za.co.sindi.ai.openai.models.ChatRequestUserStringMessage;
import za.co.sindi.ai.openai.models.GPTModelName;

/**
 * @author Buhake Sindi
 * @since 25 January 2024
 */
public class OpenAITest {
	
	private static OpenAIClient OPENAI_CLIENT = new OpenAIClientImpl("sk-fasdfsdfasdfasdfsdfasdfsdf");
	
	static {
		System.setProperty("jdk.internal.httpclient.debug", "true");
		System.setProperty("jdk.httpclient.HttpClient.log", "errors,requests,headers,frames[:control:data:window:all],content,ssl,trace,channel,all");
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
//		testChatCompletion();
		testChatCompletionStream();
	}
	
	private static void testChatCompletion() throws IOException, InterruptedException {
		List<ChatRequestMessage<?>> messages = new ArrayList<>();
		messages.add(new ChatRequestUserStringMessage("Please tell me a joke."));
		ChatCompletionRequest request = new ChatCompletionRequest(messages, GPTModelName.getLatest().toString());
		ChatCompletion completion = OPENAI_CLIENT.send(request);
		System.out.println(completion.getChoices().iterator().next().getMessage().getContent());
	}
	
	private static void testChatCompletionStream() throws IOException, InterruptedException {
		List<ChatRequestMessage<?>> messages = new ArrayList<>();
		messages.add(new ChatRequestUserStringMessage("Please tell me a joke."));
		ChatCompletionRequest request = new ChatCompletionRequest(messages, GPTModelName.getLatest().toString());
		request.getConversation().setStream(true);
		Stream<ChatCompletionChunk> chunks = OPENAI_CLIENT.sendStreaming(request);
		chunks.forEach(chunk -> System.out.println(chunk.getChoices().iterator().next().getDelta().getContent()));
	}
	
	private static void testAudioTranscription() throws IOException, InterruptedException {
		AudioTranscriptionRequest audioTranscriptionRequest = new AudioTranscriptionRequest(Path.of("C:\\Users\\buhake.sindi\\Downloads\\My voice.mp3"), "whisper-1");
		System.out.println(OPENAI_CLIENT.send(audioTranscriptionRequest));
	}
}
