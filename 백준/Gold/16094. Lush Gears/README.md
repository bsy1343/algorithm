# [Gold IV] Lush Gears - 16094

[문제 링크](https://www.acmicpc.net/problem/16094)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 8, 정답: 7, 맞힌 사람: 7, 정답 비율: 100.000%

### 분류

배낭 문제

### 문제 설명

<p>When they are not hiking, climbing or skiing in the backcountry, the Outdoor &amp; Adventure Club of T&eacute;l&eacute;com ParisTech is constantly scavenging for new gear to support their expeditions. Luckily for them, last week, they received a generous donation from a former T&eacute;l&eacute;com student who now manages the famous mountain equipment shop &ldquo;Indiana Jones&rsquo;s Cave&rdquo;. The manager has awarded them a voucher worth C chococoins that they can spend in her shop. However, the voucher can only be used once, and any money that remains afterwards is irremediably lost!</p>

<p>The Outdoor &amp; Adventure Club has already set up a list of K gear types that they would like to purchase: tents, sleeping bags, stoves, ropes, harnesses, carabiners, ice axes, crampons, ice screws, etc. They also know how many copies of each gear type they would like to purchase. Now, for each gear type, Indiana Jones&rsquo;s Cave has many models: some are quite cheap and others are more expensive. Each model passes the Club&rsquo;s safety requirement, so the Club is fine with buying any model. Hence, the Club must choose, for each gear type, which model they will be purchasing in the requested quantity: to simplify maintenance, they will only choose one single model for each gear type. As they have the choice between models for each gear type, the goal of the Club is to spend their money in a way that minimises the number of chococoins that are lost.</p>

### 입력

<p>The input consists of several test cases. The first line consists of an integer indicating the number of test cases. Each test case follows. The first line of a test case consists of two integers 0 &le; C &le; 10000 and 0 &le; K &le; 45 separated by a single space: C stands for the value of the voucher in chococoins and K stands for the number of different gear types that the Club wants to buy. This is followed by K lines describing each gear type, with each line consisting of the following integers separated by single spaces: the first integer 1 &le; M<sub>i</sub> &le; 25 indicates the number of available models for this gear type, the next M integers 1 &le; P<sub>i,j</sub> &le; 5000 indicate the price of each model, and the last integer 0 &le; Q<sub>i</sub> &le; 10 indicates how many copies of this gear type the Club wants to buy.</p>

### 출력

<p>For each test case in the input, your program should produce one line. If there is no choice of models that will allow the Club to buy the requested number of copies for each gear type, the contents of the line should be IMPOSSIBLE. Otherwise, the contents of the line should be a positive integer d &ge; 0 which describes the number of chococoins that will be lost when the Club buys the requested number of copies for each gear type with a choice of models that minimizes this number. There should be no blank lines in your output.</p>