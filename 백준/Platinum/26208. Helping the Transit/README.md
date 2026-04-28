# [Platinum III] Helping the Transit - 26208

[문제 링크](https://www.acmicpc.net/problem/26208)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 25, 정답: 18, 맞힌 사람: 18, 정답 비율: 75.000%

### 분류

그래프 이론, 그래프 탐색, 강한 연결 요소

### 문제 설명

<p>The president of Nlogonia decided, by decree, that all the streets of Nlogonia should be one-way. Due to the lack of knowledge of elementary science, there was no proper planning for the changes. After the new system came in place, people would not be able to go to work, or would not be able to return home from work, for example. As a result, there was chaos and riots in lots of cities.</p>

<p>The president was impeached and the new administration of the country hired a team of scientists to solve the problem. In turn, the committee hired you, an expert in complexity of algorithms, to help them with the efficient computation of solutions.</p>

<p>So, for each city, you are given the <em>reference points</em> of the city, and the one-way streets, each of which connects two reference points. Your task is to determine the minimum number of one-way bridges that must be built in order to have full connectivity in the city. Each bridge should also connect two reference points.</p>

### 입력

<p>The first line of the input contains two integers, $N$ and $M$ ($1 &le; N &le; 10^4$, $1 &le; M &le; 10^6$), where $N$ is the number of reference points and $M$ is the number of streets. Each one of the next $M$ lines contains two integers, $R$ and $S$, $1 &le; R, S &le; N$, $R \ne S$, that corresponds to a street connecting $R$ to $S$, so that every vehicle in that street must move away from $R$, towards $S$.</p>

### 출력

<p>Your program must print a single line containing the minimum number of bridges that are necessary to make the inhabitants happy.</p>