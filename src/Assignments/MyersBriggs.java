package Assignments;

import java.util.Scanner;

public class MyersBriggs {
    public static void main (String[] args) {
         String userName;
         int extrovertCount = 0;
         int introvertCount= 0;
         int sensitiveCount = 0;
         int intuitiveCount = 0;
         int thinkerCount = 0;
         int feelerCount = 0;
         int judgingCount = 0;
         int perspectiveCount = 0;
            Scanner input = new Scanner (System.in);
            for (int i = 0; i < 20; i++) {
                System.out.println ("Enter A or B: ");
                switch (i) {
                    case 1 -> {
                        System.out.println ("""
                                S/N --> 1.
                                A. expend energy, enjoy groups
                                B. conserve energy, enjoy one-on-one
                                """);
                        userName = input.next ();
                        if (userName.equals ("A")) extrovertCount++;
                        else if (userName.equals ("B")) introvertCount++;
                        else {
                            System.out.println ("Wrong Answer ");
                        }
                    }
                    case 2 -> {
                        System.out.println ("""
                                S/N--> 2.
                                    A. interpret literally
                                    B. look for meaning and possibilities
                                """);
                        userName = input.next ();
                        if (userName.equals ("A")) sensitiveCount++;
                        else if (userName.equals ("B")) introvertCount++;
                        else {
                            System.out.println ("Wrong Answer ");
                        }
                    }
                    case 3 -> {
                        System.out.println ("""
                                S/N--> 3.
                                    A. logically, thinking, questioning
                                    B. empathetic, feeling, accommodating
                                """);
                        userName = input.next ();
                        if (userName.equals ("A")) thinkerCount++;
                        else if (userName.equals ("B")) feelerCount++;
                        else {
                            System.out.println ("Wrong Answer ");
                        }
                    }
                    case 4 -> {
                        System.out.println ("""
                                S/N--> 4.
                                    A. organized, orderly
                                    B. flexible, adaptable
                                """);
                        userName = input.next ();
                        if (userName.equals ("A")) judgingCount++;
                        else if (userName.equals ("B")) perspectiveCount++;
                        else {
                            System.out.println ("Wrong Answer ");
                        }
                    }
                    case 5 -> {
                        System.out.println ("""
                                S/N--> 5.
                                A. more outgoing, think out loud
                                B. more reserved, think to yourself
                                """);
                        userName = input.next ();
                        if (userName.equals ("A")) extrovertCount++;
                        else if (userName.equals ("B")) introvertCount++;
                        else {
                            System.out.println ("Wrong Answer ");
                        }
                    }
                    case 6 -> {
                        System.out.println ("""
                                S/N--> 6.
                                A. practical, realistic, experiential
                                B. imaginative, innovative, theoretical
                                """);
                        userName = input.next ();
                        if (userName.equals ("A")) sensitiveCount++;
                        else if (userName.equals ("B")) intuitiveCount++;
                        else {
                            System.out.println ("Wrong Answer");
                        }
                    }
                    case 7 -> {
                        System.out.println ("""
                                S/N--> 7.
                                A. candid, straight forward, frank
                                B. tactful, kind, encourage
                                """);
                        userName = input.next ();
                        if (userName.equals ("A")) thinkerCount++;
                        else if (userName.equals ("B")) feelerCount++;
                        else {
                            System.out.println ("Wrong Answer ");
                        }
                    }
                    case 8 -> {
                        System.out.println ("""
                                S/N--> 8.
                                A. plan, schedule
                                B. unplanned, spontaneous
                                """);
                        userName = input.next ();
                        if (userName.equals ("A")) judgingCount++;
                        else if (userName.equals ("B")) perspectiveCount++;
                        else {
                            System.out.println ("Wrong Answer");
                        }
                    }
                    case 9 -> {
                        System.out.println ("""
                                S/N--> 9.
                                A. seek many tasks, public activities, interaction with others
                                B. seek private, solitary activities with quiet to concentrate
                                """);
                        userName = input.next ();
                        if (userName.equals ("A")) extrovertCount++;
                        else if (userName.equals ("B")) introvertCount++;
                        else {
                            System.out.println ("Wrong Answer");
                        }
                    }
                    case 10 -> {
                        System.out.println ("""
                                S/N--> 10.
                                A. standard, usual, conventional
                                B. different, novel, unique
                                """);
                        userName = input.next ();
                        if (userName.equals ("A")) sensitiveCount++;
                        else if (userName.equals ("B")) intuitiveCount++;
                        else {
                            System.out.println ("Wrong Answer");
                        }
                    }
                    case 11 -> {
                        System.out.println ("""
                                S/N--> 11.
                                A. firm, tend to criticize, hold the line
                                B. gentle, tend to appreciate, concise
                                """);
                        userName = input.next ();
                        if (userName.equals ("A")) thinkerCount++;
                        else if (userName.equals ("B")) feelerCount++;
                        else {
                            System.out.println ("Wrong Answer ");
                        }
                    }
                    case 12 -> {
                        System.out.println ("""
                                S/N--> 12.
                                A. regulated, structured
                                B. easygoing, "live" and "let live"
                                """);
                        userName = input.next ();
                        if (userName.equals ("A")) judgingCount++;
                        else if (userName.equals ("B")) perspectiveCount++;
                        else {
                            System.out.println ("Wrong Answer");
                        }
                    }
                    case 13 -> {
                        System.out.println ("""
                                S/N--> 13.
                                A. external, communicative, express yourself
                                B. internal, reticent, keep to yourself
                                """);
                        userName = input.next ();
                        if (userName.equals ("A")) extrovertCount++;
                        else if (userName.equals ("B")) introvertCount++;
                        else {
                            System.out.println ("Wrong Answer");
                        }
                    }
                    case 14 -> {
                        System.out.println ("""
                                S/N--> 14.
                                A. focus on here-and-now
                                B. look to the future, global perspective, "big picture"
                                """);
                        userName = input.next ();
                        if (userName.equals ("A")) sensitiveCount++;
                        else if (userName.equals ("B")) intuitiveCount++;
                        else {
                            System.out.println ("Wrong Answer ");
                        }
                    }
                    case 15 -> {
                        System.out.println ("""
                                S/N--> 15.
                                A. tough-minded, just
                                B. tender-hearted, merciful
                                """);
                        userName = input.next ();
                        if (userName.equals ("A")) thinkerCount++;
                        else if (userName.equals ("B")) feelerCount++;
                        else {
                            System.out.println ("Wrong Answer");
                        }
                    }
                    case 16 -> {
                        System.out.println ("""
                                S/N--> 16.
                                A. preparation, plan ahead
                                B. go with the flow, adapt as you go
                                """);
                        userName = input.next ();
                        if (userName.equals ("A")) judgingCount++;
                        else if (userName.equals ("B")) perspectiveCount++;
                        else {
                            System.out.println ("Wrong Answer");
                        }
                    }
                    case 17 -> {
                        System.out.println ("""
                                S/N--> 17.
                                A. active, initiate
                                B. reflective, deliberate
                                """);
                        userName = input.next ();
                        if (userName.equals ("A")) extrovertCount++;
                        else if (userName.equals ("B")) introvertCount++;
                        else {
                            System.out.println ("Wrong Answer ");
                        }
                    }
                    case 18 -> {
                        System.out.println ("""
                                S/N--> 18.
                                A. facts, things, "what is"
                                B. ideas, dreams, "what could be", philosophical
                                """);
                        userName = input.next ();
                        if (userName.equals ("A")) sensitiveCount++;
                        else if (userName.equals ("B")) intuitiveCount++;
                        else {
                            System.out.println ("Wrong Answer");
                        }
                    }
                    case 19 -> {
                        System.out.println ("""
                                S/N--> 19.
                                A. matter of fact, issue-oriented
                                B. sensitive, people-oriented, compassionate
                                """);
                        userName = input.next ();
                        if (userName.equals ("A")) thinkerCount++;
                        else if (userName.equals ("B")) feelerCount++;
                        else {
                            System.out.println ("Wrong Answer ");
                        }
                    }
                    case 20 -> {
                        System.out.println ("""
                                S/N--> 20.
                                A. control, govern
                                B. latitude, freedom
                                """);
                        userName = input.next ();
                        if (userName.equals ("A")) judgingCount++;
                        else if (userName.equals ("B")) perspectiveCount++;
                        else {
                            System.out.println ("Wrong Answer ");
                        }
                    }
                }
            }
        System.out.println ("extrovert is = " + extrovertCount);
        System.out.println ("introvert is = " + introvertCount);
        System.out.println ("intuitive is = " + intuitiveCount);
        System.out.println ("feeler is = " + feelerCount);
        System.out.println ("thinker is = " + thinkerCount);
        System.out.println ("judge is = " + judgingCount);
        System.out.println ("perspective is = " + perspectiveCount);
        System.out.println ("sensitive is = " + sensitiveCount);
        System.out.println();


        extrovertOrIntrovert(extrovertCount, introvertCount);
        sensitiveOrIntuitive(sensitiveCount, intuitiveCount);
        thinkerOrFeeler(thinkerCount, feelerCount);
        judgingOrperspective(judgingCount, perspectiveCount);
        }

    private static void judgingOrperspective(int judgingCount, int perspectiveCount) {
        if(judgingCount < perspectiveCount){
            System.out.print("J");
        } else System.out.print("P");
    }

    private static void thinkerOrFeeler(int thinkerCount, int feelerCount) {
        if(thinkerCount < feelerCount){
            System.out.print("F");
        } else System.out.print("T");
    }

    private static void sensitiveOrIntuitive(int sensitiveCount, int intuitiveCount) {
        if(sensitiveCount < intuitiveCount){
            System.out.print("I");
        } else System.out.print("S");
    }

    private static void extrovertOrIntrovert(int extrovertCount, int introvertCount) {
        if(extrovertCount < introvertCount){
            System.out.print("You are I");
        } else System.out.print("You are E");
    }
}