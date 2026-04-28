# [Gold IV] Bananas - 6875

[문제 링크](https://www.acmicpc.net/problem/6875)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 17, 정답: 12, 맞힌 사람: 10, 정답 비율: 90.909%

### 분류

자료 구조, 브루트포스 알고리즘, 스택

### 문제 설명

<p>The term &ldquo;code monkey&rdquo; is sometimes used to refer to a programmer who doesn&#39;t know much about programming. This is unfair to monkeys, because contrary to popular belief, monkeys are quite smart. They have just been misunderstood. This may be because monkeys do not speak English, but only monkey language. Your job is to help humans and monkeys understand each other by writing a monkey language dictionary. For each word that is typed in, your program must determine whether it is a valid monkey language word.</p>

<p>Unlike in English, spelling in monkey language is very simple. Every word in monkey language satisfies the following rules, and every word satisfying the following rules is a monkey language word.</p>

<ol>
	<li>A monkey language word is a special type of word called an A-word, which may be optionally followed by the letter N and a monkey language word.</li>
	<li>An A-word is either only the single letter A, or the letter B followed by a monkey language word followed by the letter S.</li>
</ol>

<p>Here are some examples:The word &ldquo;A&rdquo;&#39; is a monkey language word because it is an A-word.</p>

<p>The word &ldquo;ANA&rdquo; is a monkey language word because it is the A-word &ldquo;A&rdquo; followed by the letter N and the monkey language word &ldquo;A&rdquo;.</p>

<p>The word &ldquo;ANANA&rdquo; is a monkey language word because it is the A-word &ldquo;A&rdquo; followed by the letter N and the monkey language word &ldquo;ANA&rdquo;.</p>

<p>The word &ldquo;BANANAS&rdquo; is a monkey language word because it is an A-word, since it is the letter B followed by the monkey language word &ldquo;ANANA&rdquo; followed by the letter S.</p>

<p>Write a program which accepts words, one word on each line, and for each word prints YES if the word is a monkey language word, and NO if the word is not a monkey language word. The input word &ldquo;X&rdquo; indicates the program should terminate, and there is no output for word &ldquo;X&rdquo; (even though it is not a monkey word).</p>

### 입력



### 출력

