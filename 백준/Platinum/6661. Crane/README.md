# [Platinum III] Crane - 6661

[문제 링크](https://www.acmicpc.net/problem/6661)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 60, 정답: 21, 맞힌 사람: 12, 정답 비율: 31.579%

### 분류

수학, 자료 구조, 기하학, 세그먼트 트리, 느리게 갱신되는 세그먼트 트리

### 문제 설명

<p>ACM has bought a new crane (<em>crane -- je&oslash;&aacute;b</em>) . The crane consists of&nbsp;<em>n</em>&nbsp;segments of various lengths, connected by flexible joints. The end of the&nbsp;<em>i</em>-th segment is joined to the beginning of the&nbsp;<em>i</em>&nbsp;+ 1-th one, for 1 &le;&nbsp;<em>i</em>&nbsp;&lt;&nbsp;<em>n</em>. The beginning of the first segment is fixed at point with coordinates (0, 0) and its end at point with coordinates (0,&nbsp;<em>w</em>), where&nbsp;<em>w</em>&nbsp;is the length of the first segment. All of the segments lie always in one plane, and the joints allow arbitrary rotation in that plane. After series of unpleasant accidents, it was decided that software that controls the crane must contain a piece of code that constantly checks the position of the end of crane, and stops the crane if a collision should happen.</p>

<p>Your task is to write a part of this software that determines the position of the end of the&nbsp;<em>n</em>-th segment after each command. The state of the crane is determined by the angles between consecutive segments. Initially, all of the angles are straight, i.e., 180<sup>o</sup>. The operator issues commands that change the angle in exactly one joint.</p>

### 입력

<p>The input consists of several instances, separated by single empty lines.</p>

<p>The first line of each instance consists of two integers 1 &le;&nbsp;<em>n</em>&nbsp;&le;&nbsp;10&nbsp;000 and&nbsp;<em>c</em>&nbsp;&ge;&nbsp;0 separated by a single space -- the number of segments of the crane and the number of commands. The second line consists of&nbsp;<em>n</em>&nbsp;integers&nbsp;<em>l</em><sub>1</sub>,...,&nbsp;<em>l</em><sub>n</sub>&nbsp;(1 &le;&nbsp;<em>l</em><sub>i</sub>&nbsp;&le;&nbsp;100) separated by single spaces. The length of the&nbsp;<em>i</em>-th segment of the crane is&nbsp;<em>l</em><sub>i</sub>. The following&nbsp;<em>c</em>&nbsp;lines specify the commands of the operator. Each line describing the command consists of two integers&nbsp;<em>s</em>&nbsp;and&nbsp;<em>a</em>&nbsp;(1 &le;&nbsp;<em>s</em>&nbsp;&lt;&nbsp;<em>n</em>, 0 &le;&nbsp;<em>a</em>&nbsp;&le;&nbsp;359) separated by a single space -- the order to change the angle between the&nbsp;<em>s</em>-th and the&nbsp;<em>s&nbsp;</em>+&nbsp;1-th segment to&nbsp;<em>a</em>&nbsp;degrees (the angle is measured counterclockwise from the&nbsp;<em>s</em>-th to the&nbsp;<em>s</em>&nbsp;+ 1-th segment).</p>

### 출력

<p>The output for each instance consists of&nbsp;<em>c</em>&nbsp;lines. The&nbsp;<em>i</em>-th of the lines consists of two rational numbers&nbsp;<em>x</em>&nbsp;and&nbsp;<em>y</em>&nbsp;separated by a single space -- the coordinates of the end of the&nbsp;<em>n</em>-th segment after the&nbsp;<em>i</em>-th command, rounded to two digits after the decimal point. The output is judged to be correct if each of the coordinates differs by at most 0.02 from the correct position of the end of the crane</p>