# [Gold III] Workout for a Dumbbell - 15094

[문제 링크](https://www.acmicpc.net/problem/15094)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 59, 정답: 28, 맞힌 사람: 25, 정답 비율: 53.191%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Jim Ratt has just joined a local fitness center. He&rsquo;s especially excited about a sequence of 10 machines that he cycles through three times for his workout. He has a fixed time which he spends on each machine, as well as a fixed recovery time after using a machine. Jim&rsquo;s not the brightest guy in the world, but in the absence of anything else even he would easily be able to calculate how long his workout would take.</p>

<p>But of course, Jim isn&rsquo;t the only person who uses the fitness center and wouldn&rsquo;t you know it but when Jim shows up there are always 10 other people there, each using one of the ten machines exclusively. Like Jim, each person has a fixed time they use on their machine as well as a fixed recovery time. This will sometimes cause Jim to have to wait for a particular machine, and Jim&rsquo;s usage sometimes results in the other people having to wait as well (though if both Jim and another person want to start using a machine at the same time, Jim is polite enough to let the other person go first). Jim has gone to the center often enough that he has a good idea what everyone&rsquo;s usage and recovery times are, but he has trouble determining how long it will take him to perform his workout. That&rsquo;s where you are going to flex your programming muscles.</p>

### 입력

<p>Input starts with a line containing twenty integers; the first two give Jim&rsquo;s usage and recovery time for machine 1, the next two give Jim&rsquo;s usage and recovery time for machine 2, etc. The next line contains 3 integers u r t; the first two values are the usage and recovery times for the person who is using machine 1, and t is the time when he/she first starts using the machine. The next 9 lines specify similar information for machines 2 through 10. All usage and recovery times are positive and &le; 5 000 000 and all start times t satisfy |t| &le; 5 000 000. You should assume that Jim is ready to use machine 1 at time 0.</p>

### 출력

<p>Display the time when Jim has finished his workout, i.e., the moment when he has finished his usage time on machine 10 for the third time (don&rsquo;t count the last recovery time for that machine).</p>