# [Gold III] Wooden Fence - 27623

[문제 링크](https://www.acmicpc.net/problem/27623)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 52, 정답: 16, 맞힌 사람: 14, 정답 비율: 29.787%

### 분류

다이나믹 프로그래밍, 배낭 문제

### 문제 설명

<p>Recently, Vincent has just bought a farm. He plans to enjoy his retirement by raising horses and goats on his new farm. In order to do that, he needs to build a fence to enclose his farm; otherwise, the horses and goats may escape from his farm. Fortunately, he only needs to build a fence on one side of the farm; the remaining sides are naturally fenced.</p>

<p>The fence must be exactly 2 unit high and form a perfect rectangle. Why a perfect rectangle? If the fence has a hole on the upper part, then a horse might jump over it. On the other hand, if the fence has a hole on the lower part, then a goat might crawl out of it.</p>

<p>Vincent has N boards to be used to build the fence. Each board&rsquo;s dimension is 1 &times; L<sub>i</sub>. Each board may be placed horizontally (1 &times; L<sub>i</sub>) or vertically (L<sub>i</sub> &times; 1) as long as the resulting fence has a height of 2.</p>

<p>Oh, have we told you that Vincent is infamous for his stinginess? Yes, he&rsquo;s very stingy. He demands to use ALL the available boards; he doesn&rsquo;t care about the length of the resulting fence as long as all the boards are used. Additionally, the boards must not be overlapped as he thinks that it is inefficient (remember that he&rsquo;s stingy).</p>

<p>Vincent doesn&rsquo;t know whether it is possible to build such a fence with the given constraints. He then asks you, his only friend to help him. He might give you a present if you could help him, but recalling that he&rsquo;s a stingy fellow, you want to teach him a lesson. Instead of giving the boards arrangement to build the fence, you&rsquo;ll only give him a YES or NO whether it is possible to build such a fence, and let Vincent figure out the rest.</p>

### 입력

<p>Input begins with an integer N (1 &le; N &le; 500) representing the number of boards. The next line contains N integer L<sub>i</sub> (1 &le; L<sub>i</sub> &le; 500) representing the length of each board (i.e. 1 &times; L<sub>i</sub>).</p>

### 출력

<p>Output a string either &ldquo;YES&ldquo; or &ldquo;NO&ldquo; (without quotes) whether it is possible to build a fence that satisfies all the requirements.</p>