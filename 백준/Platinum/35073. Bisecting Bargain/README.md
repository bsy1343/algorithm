# [Platinum III] Bisecting Bargain - 35073

[문제 링크](https://www.acmicpc.net/problem/35073)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 30, 정답: 22, 맞힌 사람: 19, 정답 비율: 76.000%

### 분류

많은 조건 분기, 수학, 정수론, 해 구성하기

### 문제 설명

<p>Emilia and Alex love Christmas markets. There are so many stalls to explore and so many delicious foods to try! The options seem endless: Schupfnudeln with Sauerkraut, langos, crêpes, roasted almonds, Bratwurst, twister fries and much more.</p>

<p>Here in Germany, some stalls still do not accept credit cards, so Emilia and Alex need to withdraw some cash from a nearby cash machine (also called an ATM, or Automated Teller Machine). Due to some fees, it is cheaper to withdraw all the cash they need at once, so they plan to do so.</p>

<p>This particular cash machine works in the following way: the user inputs an integer $x$, and then the machine chooses a selection of coins and banknotes that sums to €$x$. The cash machine can dispense all possible Euro coins and notes with values €$1$ and up: €$1$, €$2$, €$5$, €$10$, €$20$, €$50$, €$100$, €$200$, and €$500$. It has sufficiently many coins and notes of each type to form any combination that sums to $x$, and you do not know in advance which of these combinations it will dispense.</p>

<p>Since Emilia and Alex plan to visit some different stalls independently, they want to split the withdrawn amount evenly between them. While waiting in the long queue in front of the cash machine, Emilia suddenly realizes that this might not be possible, depending on which coins and banknotes the cash machine dispenses. For example, €$42$ might not be evenly splittable (see Sample 1), whereas no matter how €$40$ is dispensed by the cash machine, the cash can always be divided into two piles of €$20$.</p>

<p>Can the money always be split evenly if they withdraw €$n$ from the cash machine? </p>

### 입력

<p>The input consists of:</p>

<ul>
<li>One line with an integer $n$ ($1\leq n\leq 10\,000$), the amount of cash in € that Emilia and Alex want to withdraw in total.</li>
</ul>

### 출력

<p>If the money can always be split evenly, output "<code>splittable</code>". Otherwise, output the number of coins and notes, followed by their values, such that the values add to $n$ and the money cannot be split evenly.</p>

<p>If there are multiple ways of choosing coins and notes that are not splittable, you may output any one of them.</p>