package za.co.sindi.ai.openai.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbSubtype;
import jakarta.json.bind.annotation.JsonbTypeInfo;

/**
 * @author Buhake Sindi
 * @since 17 March 2025
 * @see <a href="https://platform.openai.com/docs/api-reference/responses/create">Create Model response.</a>
 */
@JsonbTypeInfo(
	key = "type",
	value = {
	    @JsonbSubtype(alias="click", type=ComputerClickAction.class),
	    @JsonbSubtype(alias="double_click", type=ComputerDoubleClickAction.class),
	    @JsonbSubtype(alias="drag", type=ComputerDragAction.class),
	    @JsonbSubtype(alias="keypress", type=ComputerKeyPressAction.class),
	    @JsonbSubtype(alias="move", type=ComputerMoveAction.class),
	    @JsonbSubtype(alias="screenshot", type=ComputerScreenshotAction.class),
	    @JsonbSubtype(alias="scroll", type= ComputerScrollAction.class),
	    @JsonbSubtype(alias="type", type=ComputerTypeAction.class),
	    @JsonbSubtype(alias="wait", type=ComputerWaitAction.class),
	}
)
public abstract class ComputerAction implements Serializable {

}
