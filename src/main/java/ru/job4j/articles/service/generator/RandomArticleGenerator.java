package ru.job4j.articles.service.generator;

import ru.job4j.articles.model.Article;
import ru.job4j.articles.model.Word;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

public class RandomArticleGenerator implements ArticleGenerator {
    @Override
    public Article generate(List<Word> words) {
        var wordsCopy = new ArrayList<>(words);
        Collections.shuffle(wordsCopy);
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (Word word : wordsCopy) {
            stringJoiner.add(word.getValue());
        }
        return new Article(stringJoiner.toString());
    }
}
