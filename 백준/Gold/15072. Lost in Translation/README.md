# [Gold II] Lost in Translation - 15072

[문제 링크](https://www.acmicpc.net/problem/15072)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 48, 정답: 21, 맞힌 사람: 16, 정답 비율: 40.000%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색, 최단 경로

### 문제 설명

<p>The word is out that you&rsquo;ve just finished writing a book entitled How to Ensure Victory at a Programming Contest and requests are flying in. Not surprisingly, many of these requests are from foreign countries, and while you are versed in many programming languages, most spoken languages are Greek to you. You&rsquo;ve done some investigating and have found several people who can translate between languages, but at various costs. In some cases multiple translations might be needed. For example, if you can&rsquo;t find a person who can translate your book from English to Swedish, but have one person who can translate from English to French and another from French to Swedish, then you&rsquo;re set. While minimizing the total cost of all these translations is important to you, the most important condition is to minimize each target language&rsquo;s distance (in translations) from English, since this cuts down on the errors that typically crop up during any translation. Fortunately, the method to solve this problem is in Chapter 7 of your new book, so you should have no problem in solving this, right?</p>

### 입력

<p>Input starts with a line containing two integers n m indicating the number of target languages and the number of translators at your disposal (1 &le; n &le; 100, 1 &le; m &le; 4500). The second line will contain n strings specifying the n target languages. After this line are m lines of the form l<sub>1</sub> l<sub>2</sub> c where l<sub>1</sub> and l<sub>2</sub> are two different languages and c is a positive integer specifying the cost to translate between them (in either direction). The languages l<sub>1</sub> and l<sub>2</sub> are always either English or one of the target languages, and any pair of languages will appear at most once in the input. The initial book is always written in English.</p>

### 출력

<p>Display the minimum cost to translate your book to all of the target languages, subject to the constraints described above, or Impossible if it is not possible.</p>