# [Bronze I] Vote - 14544

[문제 링크](https://www.acmicpc.net/problem/14544)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 259, 정답: 206, 맞힌 사람: 183, 정답 비율: 81.333%

### 분류

구현, 자료 구조, 문자열, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>Benin is organizing a presidential election the 06th march 2016. Several candidates submitted their applications for this presidential election. The CENA called &ldquo;Commission Nationale Electorale Autonome&rdquo; is responsible for managing the election.</p>

<p>According to Article 15 of the beninese electoral code, the CENA is responsible for the preparation, the organization, the supervision of voting and for the centralization of the results.</p>

<p>As a great programmer, you are asked to help the CENA to centralize the results of the presidential election.</p>

### 입력

<p>The first line of input contains a single integer P, (1 &le; P &le; 1000), which is the number of data sets that follow. Each data set consists of a line containing the number n of the candidates (1 &le; n &le; 100), a space and the number m of results to centralize (1 &le; m &le; 1000) and followed by n lines and m lines. The n lines contain the names of candidates, one per line. The m lines contain each a name X of one candidate, a space, the result R of the candidate and the center C of vote. X and C are strings that will contain at most 1000 characters. R is a positive integer.</p>

### 출력

<p>For each data set, if there is only one winner, generate one line of output with the text &ldquo;VOTE i: THE WINNER IS &rdquo; followed by the name of the winner, followed by space and followed by the total result of the winner. If not, generate the following output: &ldquo;VOTE i: THERE IS A DILEMMA&rdquo;. i is the number of the data set.</p>