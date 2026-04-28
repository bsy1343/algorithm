# [Silver IV] TETA - 10738

[문제 링크](https://www.acmicpc.net/problem/10738)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 120, 정답: 85, 맞힌 사람: 73, 정답 비율: 70.192%

### 분류

구현, 그리디 알고리즘, 브루트포스 알고리즘

### 문제 설명

<p>You have found yourself in the role of a nice lady working as a cashier in a canteen. One of the multiple reasons why the lady is considered nice by all students is because of her concern that you spend as less as possible when visiting the canteen.</p>

<p>How does she do that? Well, the strategy is really simple. Various meals can be bought in the canteen and their prices are known. Each day, a menu is offered. A menu includes 4 meals (usually it&rsquo;s soup, main course, side dish and dessert), but it&rsquo;s price is less than or equal to the sum of prices of its components. When the lady notices that you&rsquo;d spend less money if she charged you with an entire menu instead of individual things from the menu you took, then she will do so, and you will leave full and with more money in your pocket.</p>

<p>You are standing in front of the cash register with your tray and want to know how much you have to pay. Write a programme to determine it!</p>

<p>Please note: The lady can charge you with multiple menus if that comes out cheaper.</p>

### 입력

<p>The first line of input contains the integer K (1 &le; K &le; 20), the number of meals that can be bought in the canteen. For simplicity&rsquo;s sake, we will denote the meals with integers from 1 to K.</p>

<p>The second line of input contains K integers, the ith number representing the price of the meal denoted with i. The prices will be in range [1, 250].</p>

<p>The third line of input contains the integer X (1 &le; X &lt; 1000), the menu price.</p>

<p>The following line of input contains 4 integers, the labels of the meals from the menu, different from each other.</p>

<p>The fourth line of input contains the integer T (1 &le; T &le; 20), the number of meals on your tray.</p>

<p>The following line contains the list of meals you&rsquo;ve taken. Not all meals on the tray have to be distinct, it is possible to take multiple portions of a meal.</p>

### 출력

<p>The first and only line of output must contain an integer, the cost of your meal.</p>

### 힌트

<p>Clarification of the first example: You took meals 1, 3 and 4 that are part of a menu and the lady will charge you with an entire menu. Meals 6 and 7 aren&rsquo;t part of a menu, so you pay their full price.</p>

<p>Clarification of the second example: You took two portions of meal 1 (Wiener Schnitzel), but the lady will charge you one portion along with one portion of meal 2 as a menu, but will charge the other portion separately (because it doesn&rsquo;t pay off to charge it as a second menu). You took two juices (meal 6), but you pay for them separately because they are not a part of the menu.</p>