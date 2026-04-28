# [Platinum I] Flashing Fluorescents - 16042

[문제 링크](https://www.acmicpc.net/problem/16042)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 49, 정답: 28, 맞힌 사람: 17, 정답 비율: 58.621%

### 분류

구현, 다이나믹 프로그래밍, 그래프 이론, 그래프 탐색, 너비 우선 탐색, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍, 런타임 전의 전처리

### 문제 설명

<p>You have n lights, each with its own button, in a line. Pressing a light&rsquo;s button will toggle that light&rsquo;s state; if the light is on, it will turn off, and if the light is off, it will turn on. The lights change at 1 second timesteps. You can press a button at any time, but it will not take effect until the next timestep. Before each timestep, you may choose to push at most one button (you may also choose to not press any button).</p>

<p>Pushing a button will affect not just the light in question, but all lights down the line. More specifically, if you choose to press the i<sup>th</sup> button right before the k<sup>th</sup> timestep, then the (i + m)<sup>th</sup> light will toggle on the (k + m)<sup>th</sup> timestep (with i + m &le; n). For example, if you press button 5 just before time 19, then light 5 will toggle at time 19, light 6 will toggle at time 20, light 7 will toggle at time 21, and so on. If you push a button that will take effect at the same time as its light would have toggled due to an earlier button press, then the two cancel each other out, including subsequent toggles.</p>

<p>Suppose there are three lights, all of which are off at the start. If you press the first button before the first timestep, this will happen in three timesteps:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/46dd22f3-0ca2-4306-8b2d-14adb9eb2f65/-/preview/" style="width: 452px; height: 124px;" /></p>

<p>Now, suppose you press the first button before the first timestep, and then the second button between the first and second timesteps. The button press will cancel out the propagation, and this will happen (note that the propagation will go no further):</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/c340a388-0fcd-4d06-8cf0-7b2d4142a0af/-/preview/" style="width: 450px; height: 123px;" /></p>

<p>Now, suppose you press the first button before the first timestep, and then the third button between the first and second timesteps. All three lights will be on at the second timestep (but not the third):</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/7cc657be-74b0-4af9-a4fc-933c0adf7286/-/preview/" style="width: 461px; height: 124px;" /></p>

<p>You wish to turn on all the lights. What is the earliest time you could possibly see all of the lights turned on? Note that if the lights are all on at time t but not at time t + 1 due to this propagation, t is still the correct answer.</p>

### 입력

<p>Each input will consist of a single test case. Note that your program may be run multiple times on different inputs. Each test case will consist of a single string S (1 &le; |S| &le; 16). The string S will contain only the characters 1 and 0, where 1 represents that that light is initially on, and 0 represents that that light is initially off. The first character is light 1, the next is light 2, and so on.</p>

### 출력

<p>Output a single integer, which is the earliest time at which all of the lights are on.</p>