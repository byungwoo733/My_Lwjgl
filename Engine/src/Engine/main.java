package Engine;

import static org.lwjgl.glfw.GLFW.*;

import org.lwjgl.glfw.GLFWVidMode;

public class main {
	public static void main(String[] arg){
		if (!glfwInit()){
			throw new IllegalStateException("Failed to initialize GLFW!");
		}
		
		glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
		long window = glfwCreateWindow(1280, 720, "My Engine Program", 0, 0);
		if (window == 0){
			throw new IllegalStateException("Failed to initialize GLFW!");
		}
		
		GLFWVidMode videoMode = glfwGetVideoMode(glfwGetPrimaryMonitor());
		glfwSetWindowPos(window, (videoMode.width() + 1280) / 2, (videoMode.height() + 720) / 2);
		
		glfwShowWindow(window);
		
		while (!glfwWindowShouldClose(window)) {
			glfwPollEvents();
		}
	}

}
