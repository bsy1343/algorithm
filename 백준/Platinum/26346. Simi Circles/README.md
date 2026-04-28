# [Platinum V] Simi Circles - 26346

[문제 링크](https://www.acmicpc.net/problem/26346)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 40, 정답: 25, 맞힌 사람: 19, 정답 비율: 55.882%

### 분류

수학, 기하학, 도형에서의 불 연산

### 문제 설명

<p>Arup has a step-daughter, Simi, at home, so he&rsquo;s frequently in charge when she&rsquo;s swimming with her friends. Unfortunately, after she&rsquo;s done, Simi will run inside the house without completely drying herself. As she scurries through the house to the bathroom, she leaves drops of water that fall on the floor. Naturally, Arup&rsquo;s wife, Anita, blames him for not properly watching the kids and making sure they properly dry themselves before entering the house. Anita will say that the wood was ruined by the water damage. But, of course, Arup realizes that not all of the wood is ruined. Thus, he only wants to take responsibility for the area of the wood floor that has water on it.</p>

<p>When Simi runs through the house, each drop of water hits the ground and forms a perfect circle. Furthermore, she runs fast enough that any drop at most intersects with the previous drop and no others. Sometimes a drop does not intersect with the previous drop. This means that any individual drop can at most intersect with two drops: the one before it and the one after it. Assume that each drop (circle) covers some area of the wood floor. In particular, assume that a circle will not be completely encompassed (covered) by another circle.</p>

<p>Given a list of circles, where a circle in the list may only intersect the previous circle on the list and the subsequent circle on the list, determine the total area that the circles cover.</p>

### 입력

<p>The first input line contains a single positive integer, n (1 &le; n &le; 100), indicating the number of Simi circle scenarios to consider. Each of the n input sets follows. The first line of each input set contains only an integer, c (1 &le; c &le; 100), representing the number of drops for the input set. The following c lines contain information about each drop, one drop per line, in the order that the drops occurred. Each of these lines contains exactly three real numbers (each separated from the next by a single space): x (-3000 &lt; x &lt; 3000), y (-3000 &lt; y &lt; 3000), and r (0 &lt; r &lt; 10), representing (respectively) the x and y coordinates of the center of the drop (in cm) and the radius of the drop (in cm).</p>

### 출력

<p>For each Simi circle scenario, first output &ldquo;Set #i: &rdquo; where i is the input set number, starting with 1. Follow this with a single positive real number rounded to 2 decimal places, representing the total area (in cm<sup>2</sup>) covered by all of the drops for the Simi circle scenario. Thus, if the actual area is 31.674 cm<sup>2</sup>, output 31.67 and if the actual area is 31.675 cm<sup>2</sup>, output 31.68.</p>

<p>a blank line after the output for each test case. Follow the format illustrated in Sample Output.</p>

### 힌트

<p>If you need to use pi in your program, use the value 3.1415926535898.</p>