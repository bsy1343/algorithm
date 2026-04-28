# [Gold I] Island of Logic - 6319

[문제 링크](https://www.acmicpc.net/problem/6319)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 40, 정답: 11, 맞힌 사람: 10, 정답 비율: 25.641%

### 분류

브루트포스 알고리즘, 많은 조건 분기, 구현, 파싱, 문자열

### 문제 설명

<p>The Island of Logic has three kinds of inhabitants: divine beings that always tell the truth, evil beings that always lie, and human beings that are truthful during the day and lie at night. Every inhabitant recognizes the type of every other inhabitant.</p>

<p>A social scientist wants to visit the island. Because he is not able to distinguish the three kinds of beings only from their looks, he asks you to provide a communication analyzer that deduces facts from conversations among inhabitants. The interesting facts are whether it is day or night and what kind of beings the speakers are.</p>

### 입력

<p>The input file contains several descriptions of conversations. Each description starts with an integer n, the number of statements in the conversation. The following n lines each contain one statement by an inhabitant. Every statement line begins with the speaker&rsquo;s name, one of the capital letters A, B, C, D, E, followed by a colon &lsquo;:&rsquo;. Next is one of the following kinds of statements:</p>

<ul>
	<li>I am [not] ( divine | human | evil | lying ).</li>
	<li>X is [not] ( divine | human | evil | lying ).</li>
	<li>It is ( day | night ).</li>
</ul>

<p>Square brackets [] mean that the word in the brackets may or may not appear, round brackets () mean that exactly one of the alternatives separated by | must appear. X stands for some name from A, B, C, D, E. There will be no two consecutive spaces in any statement line, and at most 50 statements in a conversation.</p>

<p>The input is terminated by a test case starting with n = 0.</p>

### 출력

<p>For each conversation, first output the number of the conversation in the format shown in the sample output. Then print &ldquo;This is impossible.&rdquo;, if the conversation cannot happen according to the rules or &ldquo;No facts are deducible.&rdquo;, if no facts can be deduced. Otherwise print all the facts that can be deduced. Deduced facts should be printed using the following formats:</p>

<ul>
	<li>X is ( divine | human | evil ).</li>
	<li>It is ( day | night ).</li>
</ul>

<p>X is to be replaced by a capital letter speaker name. Facts about inhabitants must be given first (in alphabetical order), then it may be stated whether it is day or night.</p>

<p>The output for each conversation must be followed by a single blank line.</p>

### 힌트

<p>To make things clearer, we will show the reasoning behind the third input example, where A says &ldquo;I am evil.&rdquo;. What can be deduced from this? Obviously A cannot be divine, since she would be lying, similarly A cannot be evil, since she would tell the truth. Therefore, A must be human, moreover, since she is lying, it must be night. So the correct output is as shown.</p>

<p>In the fourth input example, it is obvious that A is lying since her two statements are contradictory. So, B can be neither human nor evil, and consequently must be divine. B always tells the truth, thus A must be evil. Voil`a!</p>