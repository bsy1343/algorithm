# [Platinum V] Simfonija - 17055

[문제 링크](https://www.acmicpc.net/problem/17055)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 88, 정답: 29, 맞힌 사람: 29, 정답 비율: 39.726%

### 분류

그리디 알고리즘, 누적 합, 정렬

### 문제 설명

<p>Almost no one believed in the virtuous abilities of the composer Marin. Specifically, not until the day he composed his 9th symphony.</p>

<p>The symphony can be represented as a series of frequencies that are integer numbers. In order for Marin to prove his talent and demonstrate that this symphony is not just one of many, he decided to compare it with the ancient symphony &quot;Little Night Fiesta&quot; of the best musician in history, Stjepan. In the stars it is written that the lengths of these two symphonies are equal to N.</p>

<p>Marin compares the symphonies by writing them one under the other to a piece of paper. The symphony diversity is defined as the sum of the absolute differences of the corresponding frequencies. The diversity of symphonies A and B of length N is:</p>

<p>\[\sum_{i=1}^{N}{\left| A_i - B_i \right|}\]</p>

<p>Before comparing the two symphonies, Marin will do two things. First, he will modulate his symphony by adding an integer number X to each frequency. Then he will change no more than K frequencies to some other arbitrary frequency value because he had a vision in the dream as well as every top author.</p>

<p>Marin will choose X and change some K frequencies so that his symphony is as similar to Stjepan&#39;s, i.e. so the defined diversity is minimal. Help Marin and calculate the smallest possible diversity to Stjepan&#39;s symphony.</p>

### 입력

<p>In the first line there are integer numbers N and K (1 &le; N &le; 100 000, 0 &le; K &le; N), numbers from the task&#39;s text.</p>

<p>In the second line there are N integer A<sub>i</sub> (-1 000 000 &le; A<sub>i</sub> &le; 1 000 000) which represent frequencies of Marin&#39;s symphony.</p>

<p>In the third line there are N integer B<sub>i</sub> (-1 000 000 &le; B<sub>i</sub> &le; 1 000 000) which represent frequencies of Stjepan&#39;s symphony.</p>

### 출력

<p>In the only line print out the smallest possible diversity between Marin and Stjepan&#39;s symphony.</p>