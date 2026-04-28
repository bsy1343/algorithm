# [Platinum I] Marblecoin - 15064

[문제 링크](https://www.acmicpc.net/problem/15064)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 146, 정답: 40, 맞힌 사람: 32, 정답 비율: 30.189%

### 분류

자료 구조, 그리디 알고리즘, 문자열, 집합과 맵, 우선순위 큐, 접미사 배열과 LCP 배열

### 문제 설명

<p>Cubiconia is known for having one of the highest tax rates. Taxes are calculated on a daily basis and even things that seem worthless are subject to taxes. In order to avoid the crazy tax rates, some of the emperor&rsquo;s friends created a new currency using marbles. Unfortunately, it didn&rsquo;t work out, marbles became subject to taxes as well.</p>

<p>Despite this, the emperor believes that using marbles as a currency is a great idea and that in the future they will be worth a lot more. So he decided to steal all of his friends&rsquo; marbles. To avoid unnecessary attention, in the dead of each night he will visit one of his friends and during each visit exactly one marble will be stolen. Since the emperor&rsquo;s friends keep their marbles in stacks, only a marble that is currently on the top of a stack might be stolen.</p>

<p>Each marble has a value associated to it. The amount due per owned marble is V &times; 365<sup>D</sup>, where V is the value associated to the marble and D is the number of days the marble was owned. The emperor plans to sell all the marbles once he is finished stealing them. This means that, if there is a total of T marbles, the marble owned the least amount of time will be owned for 1 day, while the one owned the maximum amount of time will be owned for T days.</p>

<p>The emperor is smart and already realized that the total due in taxes depends on the order in which marbles are stolen. To avoid paying more taxes than necessary, he would like to know the best order to steal the marbles. Can you help him?</p>

### 입력

<p>The first line contains an integer N (1 &le; N &le; 10<sup>5</sup>) representing the number of stacks the emperor is going to steal from. Each of the next N lines describes a stack with an integer K (1 &le; K &le; 10<sup>5</sup>) followed by K integers V<sub>1</sub>, V<sub>2</sub>, . . . , V<sub>K</sub> (1 &le; V<sub>i</sub> &le; 300 for i = 1, 2, . . . , K); the number K is the amount of marbles in the stack, while the numbers V<sub>1</sub>, V<sub>2</sub>, . . . , V<sub>K</sub> are the values of the marbles in the stack, from top to bottom. The total amount of marbles is at most 4 &times; 10<sup>5</sup>.</p>

### 출력

<p>Output a single line with an integer representing the minimum value due in taxes if the marbles are stolen in an optimal order. Because this number can be very large, output the remainder of dividing it by 10<sup>9</sup> + 7.</p>