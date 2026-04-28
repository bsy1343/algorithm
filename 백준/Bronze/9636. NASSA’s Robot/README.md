# [Bronze II] NASSA’s Robot - 9636

[문제 링크](https://www.acmicpc.net/problem/9636)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 225, 정답: 205, 맞힌 사람: 182, 정답 비율: 91.000%

### 분류

구현, 그리디 알고리즘

### 문제 설명

<p>NASSA&rsquo;s robot landed on Mars. The place where it landed can be modeled as an infinite 2-dimensional plane with perpendicular X-axis and Y-axis coordinates.</p>

<p>The robot continuously reports its location back to Earth, but due to a serious design flaw, it only reports the moves it makes instead of the coordinates of its exact location. Some signals went missing and never reached our reception.</p>

<p>In one of the space exploration missions, the robot sent a sequence of signals, which can be represented by a string composed of the following characters: &lsquo;U&rsquo;, &lsquo;R&rsquo;, &lsquo;D&rsquo;, &lsquo;L&rsquo; or &lsquo;?&rsquo;. &lsquo;U&rsquo; represents up (Y-coordinate increases by 1), &lsquo;R&rsquo; represents right (X-coordinate increases by 1), &lsquo;D&rsquo; represents down (Y-coordinate decreases by 1), &lsquo;L&rsquo; represents left (X-coordinate decreases by 1) and &lsquo;?&rsquo; represents a missed signal. Every character in the sequence is a single step in the corresponding direction. A missed signal is a single step in one of the four directions. The robot is initially at X-coordinate 0 and Y-coordinate 0 before starting to send the given signals.</p>

<p>After sending some signals while the robot is moving, its software crashed and the robot could not do any further moves. The researchers on the base want to limit the space where they can look for the robot. In other words, they want to find the minimum possible X-coordinate, the minimum possible Y-coordinate, the maximum possible X-coordinate and the maximum possible Y-coordinate of the current location of the robot.</p>

### 입력

<p>Your program will be tested on one or more test cases. The first line of the input will be a single integer T, the number of test cases (1 &le; T &le; 100). Followed by the test cases, each test case is described in one line which contains a non-empty string which consists of up to 100,000 letters, each letter is &lsquo;U&rsquo;, &lsquo;R&rsquo;, &lsquo;D&rsquo;, &lsquo;L&rsquo; or &lsquo;?&rsquo;. This string represents the sequence of signals as described above.</p>

### 출력

<p>For each test case, print a single line which contains 4 integers separated by a single space, which are the minimum possible X-coordinate, the minimum possible Y-coordinate, the maximum possible X-coordinate and the maximum possible Y-coordinate for the location of the robot after it stopped moving.</p>