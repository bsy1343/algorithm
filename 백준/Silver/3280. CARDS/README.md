# [Silver V] CARDS - 3280

[문제 링크](https://www.acmicpc.net/problem/3280)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 92, 정답: 76, 맞힌 사람: 74, 정답 비율: 82.222%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Dave and Hal are playing one interesting game with cards. Dave has N cards (N is divisible by three, N=3K) with numbers from 1 to N written on them.</p>

<p>Each card has the same number written on both sides, and no two cards share the same number. Cards are sorted.</p>

<p>First Hal thinks of one number from set {1, 2, ..., N}.</p>

<p>Then Dave lays cards in K rows and three columns on a table starting with card numbered by 1 filling the first row from left to right, then second row, and so on till he finishes with the last row.</p>

<p>Hal then says in which column Dave put the card with a number he thought of.</p>

<p>Dave then picks up the cards from the first column (firstly taking card from the first row, then from the second and so on to the last row), then from the second and finally from the third column in the same way. He then lays them, without shuffling, to the table again the same way as the first time.</p>

<p>Each time Dave puts all the cards on the table, Hal tells him in which column is the card with his number.</p>

<p>Dave&rsquo;s task is to guess Hal&rsquo;s number.</p>

<p>Write a program that will use Hal&rsquo;s answers to help Dave to determine the smallest set of numbers that are candidates for Hal&rsquo;s number,&nbsp;</p>

### 입력

<p>The first line of input file contains a natural number N, 3 &le; N &le; 999, the number of all cards.</p>

<p>The second line contains a natural number D, 1 &le; D &le; 10, the numbers of dealings (i.e. the number of Hal&rsquo;s answers).</p>

<p>The following D lines contain words &#39;first&#39;, &#39;second&#39; or &#39;third&#39;, denoting Hal&rsquo;s answers &ndash; one word in each line.</p>

### 출력

<p>To the first and only line of output file should be written all the numbers from the smallest set of numbers that are candidates for Hal&rsquo;s number. The numbers can be written in any order, and must be separated by a space.</p>