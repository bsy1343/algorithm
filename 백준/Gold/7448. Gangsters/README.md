# [Gold IV] Gangsters - 7448

[문제 링크](https://www.acmicpc.net/problem/7448)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 53, 정답: 17, 맞힌 사람: 14, 정답 비율: 40.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>N gangsters are going to a restaurant. The i-th gangster comes at the time T<sub>i</sub> and has the prosperity P<sub>i</sub>. The door of the restaurant has K+1 states of openness expressed by the integers in the range [0, K]. The state of openness can change by one in one unit of time; i.e. it either opens by one, closes by one or remains the same. At the initial moment of time the door is closed (state 0). The i-th gangster enters the restaurant only if the door is opened specially for him, i.e. when the state of openness coincides with his stoutness Si. If at the moment of time when the gangster comes to the restaurant the state of openness is not equal to his stoutness, then the gangster goes away and never returns.</p>

<p>The restaurant works in the interval of time [0, T].</p>

<p>The goal is to gather the gangsters with the maximal total prosperity in the restaurant by opening and closing the door appropriately.</p>

### 입력

<p>The first line of the input file contains the values N, K, and T, separated by spaces. (1 &le; N &le; 100, 1 &le; K &le; 100, 0 &le; T &le; 30,000)</p>

<p>The second line of the input file contains the moments of time when gangsters come to the restaurant T<sub>1</sub>, T<sub>2</sub>, ..., T<sub>N</sub>, separated by spaces. (0 &le; T<sub>i</sub> &le; T for &nbsp;i&nbsp;=&nbsp;1, 2, ..., N)</p>

<p>The third line of the input file contains the values of the prosperity of gangsters P<sub>1</sub>, P<sub>2</sub>, ..., P<sub>N</sub>, separated by spaces. (0 &le; P<sub>i</sub> &le; 300 for &nbsp;i&nbsp;=&nbsp;1, 2, ..., N)</p>

<p>The forth line of the input file contains the values of the stoutness of gangsters S<sub>1</sub>, S<sub>2</sub>, ..., S<sub>N</sub>, separated by spaces. (1 &le; S<sub>i</sub> &le; K for &nbsp;i&nbsp;=&nbsp;1,&nbsp;2, ..., N)</p>

<p>All values in the input file are integers.</p>

### 출력

<p>Print to the output file the single integer &ndash; the maximal sum of prosperity of gangsters in the restaurant. In case when no gangster can enter the restaurant the output should be 0.</p>