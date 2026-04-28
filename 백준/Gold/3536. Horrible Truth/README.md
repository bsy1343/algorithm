# [Gold IV] Horrible Truth - 3536

[문제 링크](https://www.acmicpc.net/problem/3536)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 18, 정답: 13, 맞힌 사람: 11, 정답 비율: 73.333%

### 분류

애드 혹, 해 구성하기

### 문제 설명

<p>In a Famous TV Show &ldquo;Find Out&rdquo; there are n characters and only one Horrible Truth. To make the series breathtaking all way long, the screenplay writer decided that every episode should show exactly one important event.</p>

<p>There are three types of the important events in this series:</p>

<ul>
	<li>character A finds out the Truth;</li>
	<li>character A finds out that the other character B knows the Truth;</li>
	<li>character A finds out that the other character B doesn&rsquo;t know the Truth.</li>
</ul>

<p>Initially, nobody knows the Truth. All events must be correct, and every fact found out must be true. If some character finds out some fact, she cannot find it out once again.</p>

<p>Moreover, to give the audience some sense of action, the writer does not want an episode to show the&nbsp;important event of the same type as in the previous episode.</p>

<p>Your task is to determine the maximal possible number of episodes in the series and to create an example of a screenplay plan.</p>

### 입력

<p>The only line of the input contains a single integer n &mdash; the number of characters in the TV show (1 &le; n &le; 100).</p>

### 출력

<p>In the first line of the output file output a single integer k &mdash; the maximal possible number of episodes in the series. Then write k lines, each containing a description of an episode. For the episode in which character A (characters are numbered 1 through n) finds out the Truth, write the line &ldquo;A 0&rdquo;. For an episode in which character A finds out that character B knows the Truth, write the line &ldquo;A B&rdquo;. Similarly, for an episode in which character A finds out that character B doesn&rsquo;t know the Truth, write the line &ldquo;A -B&rdquo;.</p>

<p>If there are several plans providing the maximal possible number of episodes, output any one of them.</p>