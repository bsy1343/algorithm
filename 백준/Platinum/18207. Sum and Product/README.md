# [Platinum IV] Sum and Product - 18207

[문제 링크](https://www.acmicpc.net/problem/18207)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 98, 정답: 64, 맞힌 사람: 58, 정답 비율: 69.048%

### 분류

수학, 애드 혹

### 문제 설명

<p>Sarah and Patricia are young, very gifted sisters. Ever since they learned arithmetic in preschool, they have been bothering their mother Marguerite day and night to practice their calculations. Marguerite bought the two girls an arithmetic practice book, which has n pages and a positive integer on each page. Those integers can be used for practicing arithmetic calculations. Marguerite hopes that the book can keep the two girls busy for a while so that she can work on her other chores.</p>

<p>Sarah and Patricia need to know whether their calculated answers are right, but Marguerite does not have the time to check their work. She therefore comes up with the clever idea of adversarial toddler training. Marguerite knows that Sarah is good at addition and Patricia is talented in multiplication. So she first chooses a range of consecutive book pages (at least two), and then asks Sarah to calculate the sum of the integers on these pages, and asks Patricia to calculate the product of these integers. If she chooses the pages carefully, then the two girls&rsquo; answers would be the same, and she can simply let Sarah and Patricia compare their answers!</p>

<p>As Sarah and Patricia do not want to practice on the same range multiple times, Marguerite wants to know in how many different ways she can select a range of pages for her toddler training (and when to buy a new practice book).</p>

### 입력

<p>The input has a single integer n (2 &le; n &le; 2 &middot; 10<sup>5</sup>) on the first line. The second line has n positive integers giving the numbers in the arithmetic practice book ordered by the pages. None of these integers are larger than 10<sup>9</sup>.</p>

### 출력

<p>Output a single integer, the number of ways for Marguerite to choose a range of at least two consecutive pages so that Sarah&rsquo;s answer matches Patricia&rsquo;s.</p>