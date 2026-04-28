# [Platinum IV] Equipment Box - 3479

[문제 링크](https://www.acmicpc.net/problem/3479)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 44, 정답: 15, 맞힌 사람: 11, 정답 비율: 45.833%

### 분류

기하학

### 문제 설명

<p>There is a large room in the Pyramid called Room-of-No-Return. Its floor is covered by rectangular tiles of equal size. The name of the room was chosen because of the very high number of traps and mechanisms in it. The ACM group has spent several years studying the secret plan of this room. It has made a clever plan to avoid all the traps. A specially trained mechanic was sent to deactivate the most feared trap called Shattered Bones. After deactivating the trap the mechanic had to escape from the room. It is very important to step on the center of the tiles only; he must not touch the edges. One wrong step and a large rock falls from the ceiling squashing the mechanic like a pancake. After deactivating the trap, he realized a horrible thing: the ACM plan did not take his equipment box into consideration. The box must be laid onto the ground because the mechanic must have both hands free to prevent contact with other traps. But when the box is laid on the ground, it could touch the line separating the tiles. And this is the main problem you are to solve.</p>

### 입력

<p>The input consists of T test cases. The number of them (T) is given on the first line of the input file. Each test case consists of a single line. The line contains exactly four integer numbers separated by spaces: A, B, X and Y. A and Bindicate the dimensions of the tiles, X and Y are the dimensions of the equipment box (1 &lt;= A,B,X,Y &lt;= 50000).</p>

### 출력

<p>Your task is to determine whether it is possible to put the box on a single tile -- that is, if the whole box fits on a single tile without touching its border. If so, you are to print one line with the sentence &quot;Escape is possible.&quot;. Otherwise print the sentence &quot;Box cannot be dropped.&quot;.</p>