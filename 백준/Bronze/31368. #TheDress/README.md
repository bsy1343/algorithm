# [Bronze II] #TheDress - 31368

[문제 링크](https://www.acmicpc.net/problem/31368)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 116, 정답: 80, 맞힌 사람: 76, 정답 비율: 68.468%

### 분류

수학, 구현, 문자열, 사칙연산

### 문제 설명

<p>After landing on planet i1c5l people noticed that blue and black clothes are quite popular among the locals. Each aboriginal has at least one blue-and-black piece of clothing in their wardrobe. This makes no interest except one curious detail: the locals claimed that these colors weren&rsquo;t blue and black but white and gold.</p>

<p>Thus a simple test was created to differ a human being from an alien. On one of the wedding parties people took a picture of the blue-and-black groom mother&rsquo;s dress. This picture was shown to some respondents who were asked the color of the dress. If the answer contained &lt;&lt;blue&gt;&gt; and &lt;&lt;black&gt;&gt; then there was no doubt that the respondent was from the Earth. The answer containing &lt;&lt;white&gt;&gt; and &lt;&lt;gold&gt;&gt; pointed to the person of planet i1c5l origin. If the answer contained neither of word pairs then it was clear that the respondent was a creature from another planet.</p>

<p>You have the complete survey log from planet i1c5l. Your task is to determine the constitution of the planet&rsquo;s population based on the survey.</p>

### 입력

<p>The first line contains single integer $N$ --- the number of respondents ($1 \le N \le 100$). The following $N$ lines contain the answers. No line is empty and no line is longer than 100 characters. The answer contains only lower-case Latin letters and spaces. It is guaranteed that no answer can contain &lt;&lt;blue&gt;&gt;, &lt;&lt;black&gt;&gt;, &lt;&lt;white&gt;&gt;, and &lt;&lt;gold&gt;&gt; simultaneously.</p>

### 출력

<p>Output three numbers that describe the planet&rsquo;s population, each on separate line.</p>

<p>The first number --- percentage of earthlings in population.</p>

<p>The second number --- percentage of aboriginals in population.</p>

<p>The third number --- percentage of another planet creatures in population.</p>

<p>Output all numbers with $10^{-5}$ accuracy.</p>