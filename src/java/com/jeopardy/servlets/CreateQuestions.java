package com.jeopardy.servlets;

import com.jeopardy.beans.Question;
import java.util.*;

public class CreateQuestions {
    
    //List<Question> questions = new ArrayList();
    
    Question[] q = new Question[25];

    public  CreateQuestions() {
        /*Programming Category*/
        // initialize questions and set categories
        for(int i = 0; i < 25; i++) {
            q[i] = new Question();
            if (i < 5)
                q[i].setCategory("Programming");
            else if (i < 10)
                q[i].setCategory("Video Games");
            else if (i < 15)
                q[i].setCategory("Ice Hockey");
            else if (i < 20)
                q[i].setCategory("Ancient History");
            else
                q[i].setCategory("Astronomy");
        }
        
        q[0].setQuestion("Originally developed to implement the UNIX operating " +
                           "system, it has become one of the most widely used " +
                            "programming languages.");
        q[0].setAnswer1("B");
        q[0].setAnswer2("Java");
        q[0].setAnswer3("C");
        q[0].setAnswer4("C++");
        q[0].setCorrectAnswer(3);
        q[0].setQuestionValue(200);
        
        q[1].setQuestion("The set of rules that specify the correct combined " +
                           "sequence of symbols that can be used to form a " +
                            "correctly structured program.");
        q[1].setAnswer1("Code");
        q[1].setAnswer2("Syntax");
        q[1].setAnswer3("Programming Rules");
        q[1].setAnswer4("Index");
        q[1].setCorrectAnswer(2);
        q[1].setQuestionValue(400);
    
        q[2].setQuestion("Developed by IBM in the 1950's, it was the first widely " + 
                        "used high-level programming language.");
        q[2].setAnswer1("Fortran");
        q[2].setAnswer2("Lisp");
        q[2].setAnswer3("ALGOL");
        q[2].setAnswer4("COBOL");
        q[2].setCorrectAnswer(1);
        q[2].setQuestionValue(600);
        
        q[3].setQuestion("He designed the programming language, Lisp.");
        q[3].setAnswer1("John McCarthy");
        q[3].setAnswer2("Steve Russell");
        q[3].setAnswer3("Harold Abelson");
        q[3].setAnswer4("Dennis Ritchie");
        q[3].setCorrectAnswer(1);
        q[3].setQuestionValue(800);
        
        q[4].setQuestion("Of the big four early high-level programming languages " + 
                            "this one had the biggest influence on future languages.");
        q[4].setAnswer1("COBOL");
        q[4].setAnswer2("FORTRAN");
        q[4].setAnswer3("Lisp");
        q[4].setAnswer4("ALGOL");
        q[4].setCorrectAnswer(4);
        q[4].setQuestionValue(1000);
        
        /*Video Games Category*/
        
        q[5].setQuestion("Introduced in 1981's Donkey Kong, he has become the " + 
                            "most well-known video game character.");
        q[5].setAnswer1("Mario");
        q[5].setAnswer2("Donkey Kong");
        q[5].setAnswer3("Master Chief");
        q[5].setAnswer4("Pikachu");
        q[5].setCorrectAnswer(1);
        q[5].setQuestionValue(200);
        
        q[6].setQuestion("This video game console has the highest number of " +
                "video game console sales of all time");
        q[6].setAnswer1("XBox 360");
        q[6].setAnswer2("Nintendo 64");
        q[6].setAnswer3("Wii");
        q[6].setAnswer4("PlayStation 2");
        q[6].setCorrectAnswer(4);
        q[6].setQuestionValue(400);
        
        q[7].setQuestion("Originally bundled with Tetris, it became by far the " +
                "most popular handheld console of its time.");
        q[7].setAnswer1("Sega GameGear");
        q[7].setAnswer2("Nintendo GameBoy");
        q[7].setAnswer3("Nintendo DS");
        q[7].setAnswer4("Atari Lynx");
        q[7].setCorrectAnswer(2);
        q[7].setQuestionValue(600);
        
        q[8].setQuestion("Released in 1993, this game ushered in the popularity " +
                "of the first-person-shooter genre.");
        q[8].setAnswer1("Wolfenstein 3D");
        q[8].setAnswer2("Halo");
        q[8].setAnswer3("Doom");
        q[8].setAnswer4("Call of Duty");
        q[8].setCorrectAnswer(3);
        q[8].setQuestionValue(800);
        
        q[9].setQuestion("Made popular by Contra, the Konami code's first " + 
                "appearance was actually in this game.");
        q[9].setAnswer1("Castlevania");
        q[9].setAnswer2("Metal Gear");
        q[9].setAnswer3("Gradius");
        q[9].setAnswer4("Ganbare Goemon");
        q[9].setCorrectAnswer(3);
        q[9].setQuestionValue(1000);
        
        /*Ice Hockey Questions*/
        q[10].setQuestion("This leagues is the highest level for men's ice " + 
                "hockey in the world.");
        q[10].setAnswer1("KHL");
        q[10].setAnswer2("NHL");
        q[10].setAnswer3("AHL");
        q[10].setAnswer4("SEL");
        q[10].setCorrectAnswer(2);
        q[10].setQuestionValue(200);
        
        q[11].setQuestion("He accumulated the most Points of any NHL player.");
        q[11].setAnswer1("Mario Lemieux");
        q[11].setAnswer2("Bobby Orr");
        q[11].setAnswer3("Gordie Howe");
        q[11].setAnswer4("Wayne Gretzky");
        q[11].setCorrectAnswer(4);
        q[11].setQuestionValue(400);
        
        q[12].setQuestion("The club that has won the most Stanley Cup titles.");
        q[12].setAnswer1("Montreal Canadiens");
        q[12].setAnswer2("Toronto Maple Leafs");
        q[12].setAnswer3("Chicago Blackhawks");
        q[12].setAnswer4("Detroit Red Wings");
        q[12].setCorrectAnswer(1);
        q[12].setQuestionValue(600);
        
        q[13].setQuestion("The only defenceman to lead the league in scoring, " +
                "he did it twice.");
        q[13].setAnswer1("Paul Coffey");
        q[13].setAnswer2("Erik Karlsson");
        q[13].setAnswer3("Nicklas Lidstrom");
        q[13].setAnswer4("Bobby Orr");
        q[13].setCorrectAnswer(4);
        q[13].setQuestionValue(800);
        
        q[14].setQuestion("Considered by the NHL to be its first dynasty, this " +
                "club won 4 Stanley Cup titles between 1920 and 1927.");
        q[14].setAnswer1("Montreal Candiens");
        q[14].setAnswer2("Toronto Maple Leafs");
        q[14].setAnswer3("Ottawa Senators");
        q[14].setAnswer4("Montreal Maroons");
        q[14].setCorrectAnswer(3);
        q[14].setQuestionValue(1000);
        
        /*History Questions*/
        
        q[15].setQuestion("This city built an empire that stretched from " + 
                "Northern Europe to North Africa and East to the Persian Gulf.");
        q[15].setAnswer1("Rome");
        q[15].setAnswer2("Athens");
        q[15].setAnswer3("Venice");
        q[15].setAnswer4("Moscow");
        q[15].setCorrectAnswer(1);
        q[15].setQuestionValue(200);
        
        q[16].setQuestion("This ancient city was the birthplace of democracy " +
                "and philosophy.");
        q[16].setAnswer1("Rome");
        q[16].setAnswer2("Athens");
        q[16].setAnswer3("Carthage");
        q[16].setAnswer4("Sparta");
        q[16].setCorrectAnswer(2);
        q[16].setQuestionValue(400);
        
        q[17].setQuestion("This century BC saw the construction of the Great " +
                "Pyramid of Giza.");
        q[17].setAnswer1("15th");
        q[17].setAnswer2("5th");
        q[17].setAnswer3("26th");
        q[17].setAnswer4("18th");
        q[17].setCorrectAnswer(3);
        q[17].setQuestionValue(600);
        
        q[18].setQuestion("The largest contiguous land empire in history.");
        q[18].setAnswer1("Roman Empire");
        q[18].setAnswer2("Macedonian Empire");
        q[18].setAnswer3("British Empire");
        q[18].setAnswer4("Mongol Empire");
        q[18].setCorrectAnswer(4);
        q[18].setQuestionValue(800);
        
        q[19].setQuestion("The last Roman Emperor, his death marked the end of " +
                "the Roman Empire.");
        q[19].setAnswer1("Constantine XI");
        q[19].setAnswer2("Julius Caesar");
        q[19].setAnswer3("Romulus Augustulus");
        q[19].setAnswer4("Augustus Caesar");
        q[19].setCorrectAnswer(1);
        q[19].setQuestionValue(1000);
        
        /*Astronomy Questions*/
        q[20].setQuestion("The largest moon in the solar system, it is bigger " +
                "than Mercury.");
        q[20].setAnswer1("Titan");
        q[20].setAnswer2("Ganymede");
        q[20].setAnswer3("The Moon");
        q[20].setAnswer4("Charon");
        q[20].setCorrectAnswer(2);
        q[20].setQuestionValue(200);
        
        q[21].setQuestion("The nearest start to Earth, after the Sun.");
        q[21].setAnswer1("Sirius");
        q[21].setAnswer2("Barnard's Star");
        q[21].setAnswer3("Proxima Centauri");
        q[21].setAnswer4("Alpha Centauri");
        q[21].setCorrectAnswer(3);
        q[21].setQuestionValue(400);
        
        q[22].setQuestion("It is the densest planet in the solar system.");
        q[22].setAnswer1("Jupiter");
        q[22].setAnswer2("Neptune");
        q[22].setAnswer3("Venus");
        q[22].setAnswer4("Earth");
        q[22].setCorrectAnswer(4);
        q[22].setQuestionValue(600);
        
        q[23].setQuestion("A spoonful of this dense star would weigh more than " +
                "all the people on Earth.");
        q[23].setAnswer1("Neutron Star");
        q[23].setAnswer2("Dwarf Star");
        q[23].setAnswer3("Black Hole");
        q[23].setAnswer4("Supergiant Star");
        q[23].setCorrectAnswer(1);
        q[23].setQuestionValue(800);
        
        q[24].setQuestion("This effect led Edwin Hubble to discover the expansion " +
                "of the Universe?");
        q[24].setAnswer1("Microwave Background");
        q[24].setAnswer2("Anisotropy");
        q[24].setAnswer3("Redshift");
        q[24].setAnswer4("Apparent Magnitude");
        q[24].setCorrectAnswer(3);
        q[24].setQuestionValue(1000);
        
        //questions.addAll(Arrays.asList(q));
    }
    
    public Question[] getQuestions() {
        return q;
    }
}
