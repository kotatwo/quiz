package com.design_shinbi.quiz.test;

import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.design_shinbi.quiz.Question;

class QuizTest {

	@Test
	void test() {
		String line = "これなんて読む？塵芥,ちりあくた,じんさ,かかい,ちりかい";
		
		Question question = new Question();
		question.readLine(line);
		question.display();
	}
	
	@Test
	void testResource() throws IOException{
		List<Question> questions = Question.getQuestions();//staticの場合クラス名.メソッドで呼び出す
		
		for(Question question : questions) {
			question.display();
		}
	}

}
