# [Platinum II] Animesh has a war with tribal leader Malvika - 30158

[문제 링크](https://www.acmicpc.net/problem/30158)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 7, 정답: 4, 맞힌 사람: 4, 정답 비율: 57.143%

### 분류

수학, 그리디 알고리즘, 조합론

### 문제 설명

<p>Malvika is the leader of a large tribal army, with soldiers from multiple tribes. There are a total of n soldiers in the army. You are given an array a of length n, where a[i] denotes the tribe number of the i<sup>th</sup> soldier.</p>

<p>Now Animesh, the leader of the neighboring tribe and staunch enemy of Malvika, has attacked her army and declared a war which would later be regarded as the greatest tribal war of the contemporary world. For this soon-to-be-lengendry war, Malvika wanted to evaluate the strength of her army. Malvika&#39;s army&#39;s strength is based on love, i.e., the pairwise strength of two people from the different tribes would be zero, while for those from the same tribe, it will be the distance between their positions in the line. The more the distance, the lonelier they feel. The lonelier they feel, the more they love each other. As their love grows, so does the strength of the army.</p>

<p>Formally, strength of an army denoted by an array a will be the sum of pairwise strengths of each pair of people from the same tribe, i.e. sum of all |i - j| for 1 &le; i &le; j &le; n such that a[i] = a[j].</p>

<p>Malvika wants to rearrange her army to maximize the strength. Let M denote the maximum strength of her army after rearranging the soldiers. You have to help her find out the number of rearrangements of her army having the maximum strength. The more the rearrangements are, there are more chances of her winning the battle. As they say, you can win the battle with a lot of strength, but you need rearrangements of that strength to win the war. Since the battle is expected to be long drawn, the answer could be very large. So, print your answer modulo 10<sup>9</sup> + 7.</p>

<p>Two arrangements of the army &mdash; A and B &mdash; are said to be distinct if there is an index i from 1 to n, such that A[i] &ne; B[i]. That is, if some position in the army is occupied by soldiers from different tribes in the two arrangements.</p>

### 입력

<p>The first line of input contains a single integer T denoting the number of test cases.</p>

<p>The first line of each test case contains a single integer n as defined in the statement.</p>

<p>The second line of each test case will contain n space separated integers denoting the array a.</p>

### 출력

<p>For each test case, output a single integer in a line corresponding to the answer of the problem.</p>

### 제한

<ul>
	<li>1 &le; T &le; 10</li>
	<li>1 &le; n &le; 10<sup>5</sup></li>
	<li>1 &le; a[i] &le; 10<sup>9</sup></li>
</ul>

### 힌트

<p>In the first example, the strength of the army is zero irrespective of the way she arranges her army. There are two ways of arranging the army, namely {1, 2} and {2, 1}.</p>

<p>In the second example, she can arrange a maximum strength army in four ways. Those are {1, 2, 1, 2}, {1, 2, 2, 1}, {2, 1, 1, 2}, {2, 1, 2, 1}. Strength of her army in all the four cases will be 4, the maximum possible strength of the army that she can get.</p>