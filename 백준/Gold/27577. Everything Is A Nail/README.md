# [Gold II] Everything Is A Nail - 27577

[문제 링크](https://www.acmicpc.net/problem/27577)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 1024 MB

### 통계

제출: 121, 정답: 49, 맞힌 사람: 38, 정답 비율: 54.286%

### 분류

다이나믹 프로그래밍, 브루트포스 알고리즘, 누적 합, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>As an employee of the Iffy Colossal Pinnacle Construction (ICPC) company building a very tall skyscraper, you have a number of tasks to complete high above the ground in a specific order.  You can always choose to skip a task, but you fear that doing so too many times might cause some catastrophic failure of the building. You cannot revisit or complete a task once it has been skipped.</p>

<p>Each task is a nail, a screw, or a bolt. You have three tools: a hammer (works on nails), a screwdriver (works on screws), and a wrench (works on bolts). When you start a new task you can choose to switch your tool out by dropping it (hopefully no one was below you at the time), but when you do so you permanently lose the dropped tool.</p>

<p>Given the list of tasks in the order they should be completed, determine the maximum number of tasks that can be completed.  You may choose to use any tool as the initial tool.</p>

### 입력

<p>The first line of input contains an integer $n$ ($1 \leq n \leq 3 \times 10^5$), which is the number of tasks you need to complete.  </p>

<p>Each of the next $n$ lines contains a single integer $t$ ($0 \le t \le 2$). These are the tasks, in order. Each task is one of $0$ (nail), $1$ (screw), or $2$ (bolt).</p>

### 출력

<p>Output a single integer, which is the maximum number of tasks that can be completed.</p>