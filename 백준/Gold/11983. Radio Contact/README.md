# [Gold II] Radio Contact - 11983

[문제 링크](https://www.acmicpc.net/problem/11983)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 230, 정답: 145, 맞힌 사람: 125, 정답 비율: 61.275%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Farmer John has lost his favorite cow bell, and Bessie the cow has agreed to help him find it! They both fan out and search the farm along different paths, but stay in contact via radio so they can keep in touch with each-other. Unfortunately, the batteries in their radios are running low, so they want to plan their movements so as to conserve power, by trying to stay always within a short distance apart.</p>

<p>Farmer John starts at location (\(f_x, f_y\)) and plans to follow a path consisting of \(N\) steps, each of which is either &#39;N&#39; (north), &#39;E&#39; (east), &#39;S&#39; (south), or &#39;W&#39; west. Bessie starts at location (\(b_x, b_y\)) and follows a similar path consisting of \(M\) steps. Both paths may share points in common. At each time step, Farmer John can either stay put at his current location, or take one step forward along his path, in whichever direction happens to be next (assuming he has not yet reached the final location in his path). Bessie can make a similar choice. At each time step (excluding the first step where they start at their initial locations), their radios consume energy equal to the square of the distance between them.</p>

<p>Please help FJ and Bessie plan a joint movement strategy that will minimize the total amount of energy consumed up to and including the final step where both of them first reach the final locations on their respective paths.</p>

### 입력

<p>The first line of input contains \(N\) and \(M\) (\(1 \leq N, M \leq 1000\)). The second line contains integers \(f_x\) and \(f_y\), and the third line contains \(b_x\) and \(b_y\) (\(0 \leq f_x, f_y, b_x, b_y \leq 1000\)). The next line contains a string of length \(N\) describing FJ&#39;s path, and the final line contains a string of length \(M\) describing Bessie&#39;s path.</p>

<p>It is guranteed that Farmer John and Bessie&#39;s coordinates are always in the range (\(0 \leq x,y \leq 1000\)) throughout their journey. Note that East points in the positive x direction and North points in the positive y direction.</p>

### 출력

<p>Output a single integer specifying the minimum energy FJ and Bessie can use during their travels.</p>