# [Silver I] Crafting Recipes - 34396

[문제 링크](https://www.acmicpc.net/problem/34396)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 15, 정답: 12, 맞힌 사람: 11, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 자료 구조, 집합과 맵

### 문제 설명

<p>After months of hard work, you've finally finished designing a contraption for your senior capstone project. Now you just have to build it. Your design is quite complex and is composed of many parts, so you want to make sure you have enough funds to build it. You know the price of all the raw materials, and your design specifies how many parts you need to build the intermediate components. Can you determine the total price of raw materials needed to construct your contraption?</p>

### 입력

<p>The first line of input is an integer, $1 \leq N \leq 200$, specifying the number of different raw materials that make up your contraption. The following $N$ lines each contain a unique string specifying the name of a raw material, followed by an integer $1 \leq C \leq 1\,000$ specifying the cost of a single unit of that raw material.</p>

<p>The next line contains an integer $1 \leq M \leq 200$ specifying the number of different intermediate components that make up the design. The following $M$ lines each contain a single "recipe" specifying the parts (where each part could be either a raw material or another intermediate component), and the quantity of each of the parts, needed to build an intermediate component. The recipe for the <code>Capstone</code> contraption is one of these $M$ recipes.</p>

<p>Each recipe begins with a string specifying the name of the intermediate component, followed by an integer $1 \leq P \leq 2\,000$ specifying the number of different parts that make up the component. $P$ pairs of information follow: a string specifying the name of the part (which again, could be either a raw material or another intermediate component), followed by an integer $1 \leq Q \leq 1\,000$ specifying the quantity of that part required to build the intermediate component.</p>

<p>You are guaranteed that all names of raw materials and intermediate components consist of only upper- and lower-case letters.</p>

<p>Note that there is one and only one recipe for each intermediate component, and that no intermediate component requires itself as a part in any way.</p>

### 출력

<p>The output is a single integer specifying the total cost of raw materials needed to construct the Capstone contraption.</p>

### 힌트

<p>Sample Input $1$ specifies that there are two raw materials <code>WoodenGear</code> and <code>MetalSprocket</code> that have a cost of $1$ and $3$, respectively. The input also specifies two intermediate components. The <code>Capstone</code> component requires five <code>StrongChassis</code> and two <code>WoodenGear</code> and the <code>StrongChassis</code> requires three <code>WoodenGear</code> and five <code>MetalSprocket</code>. The cost of a single <code>StrongChasis</code> is therefore $3 \times 1 + 5 \times 3 = 18$, and the total cost of the <code>Capstone</code> contraption is thus $5 \times 18 + 2 \times 1 = 92$.</p>