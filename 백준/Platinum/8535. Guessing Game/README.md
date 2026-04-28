# [Platinum V] Guessing Game - 8535

[문제 링크](https://www.acmicpc.net/problem/8535)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 87, 정답: 31, 맞힌 사람: 27, 정답 비율: 36.000%

### 분류

그래프 이론, 자료 구조, 그래프 탐색, 이분 탐색, 분리 집합, 이분 그래프

### 문제 설명

<p>Byteman is playing the following game with Bitman. Bitman writes down a sequence consisting of 1,000,000,000 zeros and ones. Byteman&#39;s task is to guess Bitman&#39;s sequence. He can achieve this goal by asking Bitman questions of the form: &#39;Is the sum of a subsequence of your sequence, that begins at the b-th element and ends at the e-th element of the sequence, even or odd?&#39;. After playing the game for some time, Byteman started suspecting that Bitman was cheating. He would like to know at which moment did Bitman first answer his question in an inconsistent way, so he asked you for help.</p>

<p>Write a program which:</p>

<ul>
	<li>reads a description of Byteman&#39;s questions and Bitman&#39;s answers,</li>
	<li>computes the greatest number m, for which Bitman&#39;s answers for the first m questions are consistent.</li>
</ul>

### 입력

<p>The first line of the input contains one integer n (0 &le; n &le; 100,000), the number of Byteman&#39;s questions. Each of the following n lines describes one question with the corresponding Bitman&#39;s answer in the form of three integers b, e and s (1 &le; b &le; e &le; 1,000,000,000, s &isin; {0,1}), separated by single spaces. b and e are the indices of the first and the last element of the subsequence in Byteman&#39;s question. s = 0 means that Bitman answered that the sum was even and s = 1 that it was odd.</p>

<p>&nbsp;</p>

### 출력

<p>The first and only line of the output should contain one integer, the greatest value of m such that there exists a sequence of zeros and ones that is consistent with Bitman&#39;s answers to the first m Byteman&#39;s questions.</p>

<p>&nbsp;</p>