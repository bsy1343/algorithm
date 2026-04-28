# [Platinum IV] New Friends - 5203

[문제 링크](https://www.acmicpc.net/problem/5203)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 12, 정답: 7, 맞힌 사람: 3, 정답 비율: 42.857%

### 분류

다이나믹 프로그래밍, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>During a nice day at the beach, you can also meet some nice new people who might become your friends.<sup>5</sup> If you want to stay in touch, you should make sure to get their address, e-mail, or something like that, in addition to their name. Afterwards, you may start to wonder how many different towns these people were actually from.</p>

<p>Of course, this is sometimes complicated by mistakes you make in writing down their information. If you write that one person is from &ldquo;Pasadena&rdquo;, and another from &ldquo;Passadena&rdquo;, you&rsquo;ll think they were from two towns. So we need a computer program to correct for these mistakes.</p>

<p>We&rsquo;ll have a list of names of towns that people are from. These are strings with uppercase and lowercase letters, as well as the character &lsquo;-&rsquo;. We will ignore case, i.e., &ldquo;SAN-DIEGO&rdquo; and &ldquo;san-diEgo&rdquo; denote the same town. In addition, when two strings differ by exactly one character (insertion, deletion, or overwrite), they are considered potentially the same city. For instance &ldquo;SanDIego&rdquo; and &ldquo;san-diego&rdquo; could be the same city, but &ldquo;san-diego&rdquo; and &ldquo;san-deigo&rdquo; could not. You are to compute the minimum number of cities that these people could be coming from.</p>

<p>Notice that people can only come from the same city if their city names differ at most in one character. It is not enough that there be some city name such that all of them differ in at most one character from that name. For instance, in the first example below, even though every city name differs from &ldquo;Tijuana&rdquo; by at most one character, the second and third person cannot be from the same city, so you need to assume they are from two cities.</p>

<p><sup>5</sup>Of course, you also meet a lot of people who you wouldn&rsquo;t want to be friends with. Ever.</p>

### 입력

<p>The first line contains a number K &ge; 1, which is the number of input data sets in the file. This is followed by K data sets of the following form:</p>

<p>The first line of the data set contains a number n with 1 &le; n &le; 10, the number of new friends you have met. This is followed by n lines, each containing one string of length between 1 and 100 characters, a place where one of your new friends originated.</p>

### 출력

<p>For each data set, first output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, output the minimum number of cities that these people could be from.</p>