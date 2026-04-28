# [Silver II] Lottery Games - 28338

[문제 링크](https://www.acmicpc.net/problem/28338)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 48, 정답: 25, 맞힌 사람: 21, 정답 비율: 50.000%

### 분류

임의 정밀도 / 큰 수 연산, 수학, 확률론

### 문제 설명

<p>You live in a lively town named Lottery Vegas where lots of different kinds of lottery games are available for you to play. Next to your house, you found an interesting lottery game that is called Double ticket winner ainu7 for the win, named after a really famous Miku-admirer.</p>

<p>The ainu7 lottery game consists of $P$ different lottery tickets. The i-th ticket contains numbers between $1$ and $N_i$, inclusive, and you are to pick $M_i$ numbers out of them. The ainu7 lottery game seller also picks $M_i$ numbers while you are picking. For each lottery ticket, you win if you and the seller have at least $K_i$ numbers in common with the seller. You can assume that the seller picks the numbers at random, regardless of what you pick.</p>

<p>You are curious which of the $P$ tickets gives you the highest winning odds. If there are multiple such tickets with the same highest winning odds, you want to know them all.</p>

### 입력

<p>The input consists of $T$ test cases. The number of test cases $T$ is given in the first line of the input.</p>

<p>The first line of each test case contains a single integer $P$ ($2 &le; P &le; 100$), the number of lottery tickets. Following $P$ lines contains three numbers each: $N_i$, $M_i$, and $K_i$ where $3 &le; N_i &le; 50$, $1 &le; M_i &le; N_i$, and $1 &le; K_i &le; M_i$.</p>

### 출력

<p>For each test case, you must output a single line of integer(s). It must contain the lottery game number(s) with highest winning odds. If there are multiple, you must sort them, and the game number is 1-based.</p>