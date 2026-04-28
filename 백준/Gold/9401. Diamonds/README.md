# [Gold V] Diamonds - 9401

[문제 링크](https://www.acmicpc.net/problem/9401)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 34, 정답: 10, 맞힌 사람: 9, 정답 비율: 31.034%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>King Terenas ordered his minister to design a brain-stimulating game for prince Arthas &ndash; his son &ndash; to improve his mental capabilities. The minister designed a game in which there are N boxes labeled 1, &hellip; , N; each box has a lock which can be opened only using its unique key. Before the game starts, the minister puts copies of the key of each box i in the boxes i + 1 and i &minus; 1, if they exist. Afterwards, D diamonds are placed inside D distinct boxes. Finally, all of the boxes are locked and Arthas is given the keys to some

### 입력

<p>There are multiple test cases in the input. The first line of each test case starts with the integer N (1 &le; N &le; 500), the number of boxes, followed by M (1 &le; M &le; N), the number of keys given to Arthas, followed by D (0 &le; D &le; N), the number of diamonds. The M numbers on the next line represent the boxes whose keys are given to Arthas. Labels of the boxes containing the diamonds are listed on the next line. The input terminates with a line containing &ldquo;0 0 0&rdquo;.</p>

### 출력

<p>For each test case, write a single line containing the minimum number of boxes Arthas needs to open in order to collect all diamonds.</p>