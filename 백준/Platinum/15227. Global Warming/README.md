# [Platinum III] Global Warming - 15227

[문제 링크](https://www.acmicpc.net/problem/15227)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 7, 정답: 5, 맞힌 사람: 5, 정답 비율: 71.429%

### 분류

다이나믹 프로그래밍, 그래프 이론, 그래프 탐색, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>This is a very exciting week for John. The reason is that, as a middle school teacher, he has been asked to dedicate the entire week to teaching his class of n students about the cause and effect of global warming. As John is very passionate about his planet, he&rsquo;s going to spend extra time and effort to make this week memorable and rewarding for the students. Towards that, one of the things he wants to ask them to do is to prepare, as homework, presentations about global warming. To make this a little easier for them, as well as more fun, he has asked them to do this in groups of two.</p>

<p>Of course arranging the students into groups comes with the usual headache, namely that only friends are willing to work together. Luckily the students in his class are a friendly bunch. In particular, if p, q and r are three distinct students, and p and q are friends, and q and r are friends, then p and r are also friends. But John now realizes the irony in asking his students to work at home in groups, as students may have to travel to meet their group partner, which may emit greenhouse gases such as carbon dioxide, depending on their mode of transportation. In the spirit of this week&rsquo;s topic, John asked all the students in his class to calculate, for each of their friends, how much carbon dioxide would be emitted if they were to meet up with the respective friend.</p>

<p>Using this information, can you help John figure out what is the minimum total amount of carbon dioxide that will be emitted if he arranges the groups optimally, or determine that it&rsquo;s not possible to arrange all the students into groups of two friends?</p>

### 입력

<p>The first line contains two integers n and m (1 &le; n &le; 200, 0 &le; m &le; 250), the number of students in John&rsquo;s class, and the total number of pairs of friends in the class. As John is bad with names, he has given each of his students a distinct integer identifier between 1 and n.</p>

<p>Each of the next m lines contains three integers p, q and c (1 &le; p, q &le; n, 0 &le; c &le; 10<sup>6</sup>), the identifiers of two distinct students that are friends, and how many grams of carbon dioxide would be emitted if they were in a group together, and thus had to meet. Each pair of friends is listed exactly once in the input.</p>

### 출력

<p>Output the minimum total amount of carbon dioxide, in grams, that would be emitted if John arranges all students optimally into groups of two friends, or &ldquo;impossible&rdquo; if there is no way to arrange the students into groups in that way.</p>