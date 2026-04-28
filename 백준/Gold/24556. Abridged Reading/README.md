# [Gold IV] Abridged Reading - 24556

[문제 링크](https://www.acmicpc.net/problem/24556)

### 성능 요약

시간 제한: 4 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 76, 정답: 41, 맞힌 사람: 36, 정답 비율: 57.143%

### 분류

다이나믹 프로그래밍, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>Miss Othmar is a grade school teacher who uses a very interesting textbook in her science class. &nbsp;All of the chapters in the book have material that depends on at most one previous chapter&#39;s material, while several chapters are labeled &quot;Culminating Concept&quot; chapters that have no chapters depending on them &ndash;-- they basically represent the culmination of the stream of material in all the previous chapters that must be read before them. &nbsp;Chapters that are not Culminating Concept chapters are referred to as &quot;prerequisite chapters.&quot;</p>

<p>Because of various delays caused by the pandemic, Miss Othmar is far behind where she wants to be in the class. &nbsp;It&#39;s too late to try to cover all of the Culminating Concept chapters in the book (and their required prerequisite chapters) so she has decided to cover just two more Culminating Concept chapters. &nbsp;To give the kids a break she has decided to pick the two Culminating Concept chapters which require the least amount of reading &ndash;-- this would include not only those chapters but their prerequisite chapters as well.</p>

### 입력

<p>Input starts with a line containing two integers $n$ $m$ where $n$ ($2 \leq n \leq 1\,000$) indicates the number of chapters (numbered $1$ to $n$) and $m$ ($0 \leq m &lt; n$) indicates the number of chapter dependencies. &nbsp;After this are $n$ positive values indicating the number of pages in each chapter. These values will be on one or more lines and the number of pages in any chapter is $ \leq 1\,000$. &nbsp;After this are $m$ lines each containing two &nbsp;integers $a$ $b$ $(1 \leq a &lt; b \leq n)$ indicating that chapter $a$ must be read before chapter $b$. &nbsp;No chapter appears as the second integer in these lines more than once. &nbsp;There will be at least two Culminating Concept chapters.</p>

### 출력

<p>Output the minimum number of pages that need to be read in order to complete two Culminating Concept chapters.</p>