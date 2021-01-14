package com.example.quest0;

import android.view.View;

public class Story {

    private Situation start_story;
    public Situation current_situation;
    Player player;
    MainActivity m;
    Story(MainActivity ma) {
        m = ma;
        player = ma.player;
        start_story = new Situation(
                "Вечер. Выглянув в окно на шестом этаже вы замечаете призрака \n"
                        + "- (1)Открыв окно, попросите призрака удалиться \n"
                        + "- (2)Проигнорируете его, решив, что вам показалось. Но, на всякий случай задернете штору\n"
                        + "- (3)Попробуете наладить контакт с призраком\n",
                4, 0, 0, 0);
        start_story.direction[0] = new Situation(
                "Несмотря на то, что вы были вежливы, призрак обиделся\n"
                        + "- (1)Попытаетесь утешить призрака \n"
                        + "- (2)Просто закроете окно\n"
                        + "- (3)Будете доказывать призраку, что тот сам во всем виноват\n",
                4, 10, -5, 0);
        start_story.direction[1] = new Situation(
                "Дальнейшие действия\n"
                        + "- (1)Пойти к врачу \n"
                        + "- (2)Заварить чай\n"
                        + "- (3)Будете ждать кошку Луну, в надежде стать борцом за добро и справедливость\n",
                4, -10, 0, 0);
        start_story.direction[2] = new Situation(
                "Вы смогли побеседовать с призраком\n"
                        + "- (1)Будете уламывать призрака последить за квартирой в ваше отсутствие\n(он, в отличие от собаки, в еде не нуждается) \n"
                        + "- (2)Начнёте изучать оккультизм, раз уж имеете такие чудесные способности\n"
                        + "- (3)Пойдете спать\n",
                4, 15, 10, 0);
        start_story.direction[0].direction[0] = new Situation(
                "Вы смогли успокоить приведение. Но открытое окно не идёт на пользу вашего здоровья\n"
                        + "- (1)Закроете окно, оставив призрака висеть за окном  \n"
                        + "- (2)Пригласите призрака домой и закроете окно\n"
                        + "- (3)Подскажите призраку, как попасть в кинотеатр. Как только тот удалится, позвоните экзорцисту\n",
                4, 15, -5, 0);
        start_story.direction[0].direction[1] = new Situation(
                "Призрак посчитал закрытое окно оскорблением. Конец",

                4, 0, -95, 0);
        start_story.direction[0].direction[2] = new Situation(
                "Призраку ничего доказать не получилось. Конец\n",
                4, 0, -95, 0);
        start_story.direction[1].direction[0] = new Situation(
                "К какому врачу?\n"
                        + "- (1)К терапевту \n"
                        + "- (2)К психиатору\n"
                        + "- (3)К стоматологу\n",
                4, 0, 0, 10);
        start_story.direction[1].direction[1] = new Situation(
                "Какой чай заварите\n"
                        + "- (1)Черный \n"
                        + "- (2)Зеленый\n"
                        + "- (3)Ромашку\n",
                4, 0, 0, 10);
        start_story.direction[1].direction[2] = new Situation(
                "Вы дождались Луну и стали sailor Madness!Поздравляем!\n" +
                        "Теперь у вас есть миссия - найти принцессу Лени и других сейлоров\n"
                        + "- (1)Вы все еще можете пойти к врачу. \n"
                        + "- (2)Пойдете печатать объявления 'wanted'.\n"
                        + "- (3)Надев на голову кастрюлю и выйдя на перекресток, совершите обряд призыва других сейлоров,\n" +
                        "при этом стуча по кастрюле вилкой.\n",
                4, 0, 0, 10);
        start_story.direction[2].direction[0] = new Situation(
                "Теперь ваш дом охраняет призрак. Поздравляем! Конец",
                4, 45, 10, 39);
        start_story.direction[2].direction[1] = new Situation(
                "На какое направление вы пойдете?\n"
                        + "- (1)Алхимия - будете смешивать всякую бурду в кастрюльке \n"
                        + "- (2)Гадание - нести всякую чушь, смотря на кофейную гущу \n"
                        + "- (3)Демонология - рисовать кружочки и треугольнички и петь, прыгая вокруг рисунка\n",
                4, 10, 0, -37);
        start_story.direction[2].direction[2] = new Situation(
                "Вы выспались. Поздравляю!\n",
                4, 0, 23, 0);


        start_story.direction[0].direction[0].direction[0] = new Situation(
                "Нечто решило, что вы играли с его доверием. Конец",
                4, 0, -90, 0);
        start_story.direction[0].direction[0].direction[1] = new Situation(
                "Никогда не разрешайте таким гостям войти. Конец",4, -50, -90, 0);
        start_story.direction[0].direction[0].direction[2] = new Situation(
                "Вы поступили разумно и остались живы, однако экзорцист просит сумму, которой у вас нет\n"
                        +"- (1)Позвоните другим экзорцистам \n"
                        +"- (2)Купите книгу 'Экзорцизм для чайников'\n"
                        +"- (3)Купите пособие 'Как обмануть экзорциста'"
                , 4, 20, 10, 0 );
        start_story.direction[0].direction[0].direction[2].direction[0] = new Situation(
                "Вы неуспели найти подходящего специалиста до возращения приведения. Конец",
                4, 10, -100, -50);
        start_story.direction[0].direction[0].direction[2].direction[1] = new Situation(
                "У вас под рукой не оказалось маринованных мышиных хвостиков.Зелье рвануло. Конец",
                4, 0, -100, -20);
        start_story.direction[0].direction[0].direction[2].direction[2] = new Situation(
                "Прочитав предисловие, вы поняли, что так лучше не делать", 4, 10, -100, -34);

        start_story.direction[1].direction[0].direction[0] = new Situation(
                "Терапевт назначил вам плановое обследование. Конец",
                4, 0, 0, -10);
        start_story.direction[1].direction[0].direction[1] = new Situation(
                "Психиатор выписал вам таблетки. Конец",
                4, 0, 0, -20);
        start_story.direction[1].direction[0].direction[2] = new Situation(
                "С зубами у вас все в порядке. Конец",
                4, 0, 0, -99);

        start_story.direction[1].direction[1].direction[0] = new Situation(
                "Вы выпили черного чая. Конец",
                4, 0, 1, 0);
        start_story.direction[1].direction[1].direction[1] = new Situation(
                "Вы выпили зеленого чая. Конец",
                4, 0, 5, 0);
        start_story.direction[1].direction[1].direction[2] = new Situation(
                "Вы выпили ромашковый чай. Конец",
                4, 0, 10, 0);

        start_story.direction[1].direction[2].direction[0] = new Situation(
                "Вы так и не дошли до врача. Конец",
                4, 0, -100, 0);
        start_story.direction[1].direction[2].direction[1] = new Situation(
                "Объявления вам не помогли. Конец",
                4, 30, 0, 0);
        start_story.direction[1].direction[2].direction[2] = new Situation(
                "Вы успешно совершили призыв и свалили в закат. Конец",
                4, 40, 0, 0);

        start_story.direction[2].direction[1].direction[0] = new Situation(
                "Вы стали классным алхимикоми и даже можете сварить яйцо. Поздравляем! Конец",
                4, 50, 0, 0);
        start_story.direction[2].direction[1].direction[1] = new Situation(
                "Теперь вы профи и можете нести ахинею с совершенно серьезным видом. Поздравляем! Конец",
                4, 80, 0, 0);
        start_story.direction[2].direction[1].direction[2] = new Situation(
                "Вы прекрасно поёте, не слушайте соседей - они все равно не разбираются в искусстве. Конец",
                4, 67, 0, 0);
        current_situation = start_story;
    }

    public void go(int num) {
        if (num <= current_situation.direction.length) {
            current_situation = current_situation.direction[num - 1];
            for (int i = 0; i < 3; i++) {
                if (i < current_situation.direction.length) {
                    m.choices[i].setVisibility(View.VISIBLE);
                    m.choices[i].setText(Integer.toString(i + 1));
                } else {
                    m.choices[i].setVisibility(View.INVISIBLE);
                }
            }
        }
    }

    public boolean isEnd() {
        return current_situation.direction.length == 0;
    }

}
