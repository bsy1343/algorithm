# [Gold V] If My Memory Doesn't Fail Me... - 29637

[문제 링크](https://www.acmicpc.net/problem/29637)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 11, 정답: 5, 맞힌 사람: 5, 정답 비율: 62.500%

### 분류

구현, 애드 혹, 시뮬레이션

### 문제 설명

<p>John Cameroff, a widely known film director, is preparing for shooting of his next film, &quot;Smiley&quot;. There will be lots of modern 3-D visual computer effects in the film. It will definetely lead to unprecedented success. More specifically, in the first week it is planned to gather less than 1000000000 milligrams of smashed tomatoes and rotten eggs that will be thrown to the cinema screens by indignant spectators.</p>

<p>John has calculated everything thoroughly. To make the photographic quality of visual effects, he needs $N$ computers which he plans to buy at the computer stall nearby. To make sure that the computers are of the highest quality, he decided to test the RAM of each of the computers. He has even bought $M$ USB devices designed specially for that.</p>

<p>Each of these devices, when plugged into a computer, tests more and more cells of RAM. It takes $K$ hours for one computer to be tested completely. If one unplugs a device from a computer, the memory checking process is paused. If then one plugs a device again (the same, or another one), the process resumes from the point where it stopped previously. Nothing bad will happen if the device remains plugged after all memory is checked.</p>

<p>John Cameroff appreciates his time. So he wants to know what is the minimal possible time for $N$ computers to be tested. Moreover, he wants to know the sequence of actions that leads to this result. Your task is to help him to solve this problem.</p>

### 입력

<p>The first line of the input file contains three integers $N$, $M$ and $K$ ($1 \le N, M, K \le 1000$).</p>

### 출력

<p>In the first line of the output file print the minimal time $T_{min}$, which takes all computers to be tested. The time should be printed as an irreducible fraction in the format <code>A/B</code>, where $A$ is the numerator and $B$ is the denominator. The following inequations should be true: $0 \le A \le 10^9$, $1 \le B \le 10^9$.</p>

<p>In the second line, print the number of actions $C$. Each of the following $C$ lines should contain information about an action in the following format:</p>

<p><code>N<sub>i</sub>/D<sub>i</sub>: Connect V<sub>i</sub> to K<sub>i</sub></code></p>

<p>This means that after $\frac{N_i}{D_i}$ hours from the beginning of the testing the device with number $V_i$ ($1 \le V_i \le M$) should be plugged to the computer with number $K_i$ ($1 \le K_i \le N$). If the device $V_i$ has been plugged to any computer, it is unplugged first. If some device was plugged to computer $K_i$, it is also unplugged.</p>

<p>Fractions $\frac{N_i}{D_i}$ should all be irreducible. For numbers $N_i$, $D_i$ the following inequations should be true: $0 \le N_i \le 10^9$, $1 \le D_i \le 10^9$.</p>

<p>The actions must be printed in the order of nondecreasing of time. The number of actions $C$ should not exceed $10000$.</p>

<p>If there are several possible sequences of actions that take the minimal time to be executed and satisfy the constraints on the number of actions, output any one.</p>