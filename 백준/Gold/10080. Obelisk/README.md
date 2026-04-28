# [Gold II] Obelisk - 10080

[문제 링크](https://www.acmicpc.net/problem/10080)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 34, 정답: 4, 맞힌 사람: 4, 정답 비율: 18.182%

### 분류

수학

### 문제 설명

<p>A construction site consists of K floors, each of which can be treated as an infinitely large grid. On each floor, except the bottom floor, there are a number of holes, each one square large. At the bottom floor, there is a grid that is marked X. There is a heavy rectangular obelisk, of size 1 &times; 1 &times; M , initially placed upright on the topmost floor. The construction workers would like to erect the obelisk vertically, such that one of the 1 &times; 1 faces is placed on the marked grid.</p>

<p>The obelisk is too heavy to be pushed or lifted, so the only way for the workers to move the obelisk is to roll it by tilting it along one of the edges as shown in Diagram 1.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/10080.%E2%80%85Obelisk/087cf268.png" data-original-src="https://upload.acmicpc.net/3b753a7d-3704-4f96-9f5f-8addc18a52cd/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 552px; height: 128px;" /></p>

<p style="text-align: center;">Diagram 1: Rolling an obelisk of size 1 &times; 1 &times; 2</p>

<p>To move the obelisk from one floor to another floor below it, the workers will have to position the obelisk onto a hole, such that it falls to a lower floor, as shown in Diagram 2.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/10080.%E2%80%85Obelisk/dd98dc9e.png" data-original-src="https://upload.acmicpc.net/26611a1f-a548-435e-8792-00f65a2792a4/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 552px; height: 252px;" /></p>

<p style="text-align: center;">Diagram 2: Obelisk falling through a hole</p>

<p>As previously mentioned, each hole is 1 &times; 1 in size. No two holes are adjacent on the same floor. Hence, if the obelisk is horizontally placed over a hollow grid, it will not fall, unless M is 1. However, two or more holes in different layers may be vertically aligned &ndash; in this case the obelisk will fall through more than one layer, until it lands on a non-hole grid.</p>

<p>The obelisk is initially placed such that its edges are aligned with the grid in the construction area. Initially, the obelisk will always be placed vertically upright, with one of its 1 &times; 1 faces on a grid that is not a hole.</p>

<p>Your task is to find the the least number of moves to move the obelisk from its initial position on the top floor to the grid marked X on the bottom floor.</p>

### 입력

<p>Your program must read from the standard input. The first line of the input contains 2 integers K and M, representing the number of floors and the height of the obelisk respectively.</p>

<p>The second line of the input contains four integers S<sub>x</sub>, S<sub>y</sub>, E<sub>x</sub>, E<sub>y</sub>, representing the starting x and y coordinates of the obelisk on the top floor and the ending x and y coordinates of the grid marked X on the bottom floor respectively.</p>

<p>Each of the next K - 1 lines describes the holes on each floor, starting from the top floor, down to the 2nd floor (i.e. the floor above the bottom floor). Each line begins with a positive integer h, indicating the number of holes on that floor, followed by a sequence of 2h spaceseparated integers x<sub>1</sub>, y<sub>1</sub>, x<sub>2</sub>, y<sub>2</sub>,...,x<sub>h</sub>, y<sub>h</sub>. For each i, the integers x<sub>i</sub> and y<sub>i</sub> indicate the x and y coordinates of a hole on that floor. Note that every floor except the bottom floor has at least one hole.</p>

### 출력

<p>Your program must write to the standard output a single integer, which is either the minimum number of moves needed to erect the given obelisk on the grid marked as X, or -1 if it is not possible to move the obelisk onto the grid. Note that this answer may not fit in a 32-bit integer, requiring the use of long long in C/C++ or LongInt in Pascal.</p>