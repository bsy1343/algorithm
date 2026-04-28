# [Silver I] Suitcases - 9681

[문제 링크](https://www.acmicpc.net/problem/9681)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 6, 정답: 6, 맞힌 사람: 6, 정답 비율: 100.000%

### 분류

수학, 확률론

### 문제 설명

<p>Byteasar has just arrived at the Bytetown airport and is waiting for his luggage. There are <em>n</em> people (including Byteasar) who were traveling this plane and each of them is waiting for exactly one suitcase. Suitcases are appearing on the conveyor belt in random order.</p>

<p>The Bytefly airline had been facing a serious problem with luggage handling. Many suitcases had vanished forever. In order to deal with this problem, the airline introduced an innovative system of counting the suitcases, which ensures that each aircraft always gets as much suitcases as it should. Unfortunately, it may still happen that two suitcases will be swapped and each of them will fly with the wrong plane. It was shown that for each piece of luggage, it will be on a flight to the wrong city with the probability <em>p</em>.</p>

<p>There are already <em>k</em> suitcases on the conveyor belt and none of them is the Byteasar&#39;s one. What is the probability that the Byteasar&#39;s suitcase has not arrived to Bytetown with this plane?</p>

### 입력

<p>The first and only line of input contains two integers <em>n</em>, <em>k</em> and one real number <em>p</em> (1 &le; <em>n</em> &le; 1 000 000, 0 &le; <em>k</em> &le; <em>n</em>, 0 &le; <em>p</em> &le; 1) denoting respectively the number of passengers, the number of suitcases on the conveyor belt and the probability of misplacing the suitcase. The <em>p</em> number is given with at most nine digits after the decimal point.</p>

### 출력

<p>Your program should output a single line containing the answer to the task - the probability that the Byteasar&#39;s suitcase has not arrived with his plane to Bytetown.</p>

<p>Your score will be considered correct as long as it will be in the range [<em>x</em>-<em>e</em>, <em>x</em>+<em>e</em>], where <em>x</em> is the exact answer and <em>e</em> = 10<sup>-8</sup>.</p>