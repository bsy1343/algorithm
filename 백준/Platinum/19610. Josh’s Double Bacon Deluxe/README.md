# [Platinum III] Josh’s Double Bacon Deluxe - 19610

[문제 링크](https://www.acmicpc.net/problem/19610)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 48, 정답: 22, 맞힌 사람: 18, 정답 비율: 46.154%

### 분류

다이나믹 프로그래밍, 수학, 확률론

### 문제 설명

<p>On their way to the contest grounds, Josh, his coach, and his N &minus; 2 teammates decide to stop at a burger joint that offers M distinct burger menu items. After ordering their favourite burgers, the team members line up, with the coach in the first position and Josh last, to pick up their burgers. Unfortunately, the coach forgot what he ordered. He picks a burger at random and walks away. The other team members, in sequence, pick up their favourite burger if available, or a random remaining burger if there are no more of their favourite burger. What is the probability that Josh, being last in line, will get to eat his favourite burger?</p>

### 입력

<p>The first line contains the number N (3 &le; N &le; 1 000 000), the total number of people and burgers. The next line contains N numbers, the i-th being b<sub>i</sub> (1 &le; b<sub>i</sub> &le; M &le; 500 000), denoting the item number of the i-th person&rsquo;s favourite burger. The first person in line is the coach, and the N-th person is Josh.</p>

### 출력

<p>Output a single number P, the probability that Josh will get to eat his favourite burger, b<sub>N</sub>. If the correct answer is C, the grader will view P correct if |P &minus; C| &lt; 10<sup>&minus;6</sup>.</p>