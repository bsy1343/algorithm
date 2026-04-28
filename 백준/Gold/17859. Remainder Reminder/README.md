# [Gold I] Remainder Reminder - 17859

[문제 링크](https://www.acmicpc.net/problem/17859)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 145, 정답: 71, 맞힌 사람: 51, 정답 비율: 48.113%

### 분류

수학, 정수론, 중국인의 나머지 정리

### 문제 설명

<p>&ldquo;Hey Bill, you were in charge of shipping those novelty book remainders to Remainderville, OH, right?&rdquo; asked Fred. &ldquo;Those were cute little books weren&rsquo;t they, each shaped like a cube one inch on each side. I can&rsquo;t understand why they didn&rsquo;t sell better. Can you remind me how many we shipped?&rdquo;</p>

<p>&ldquo;Well,&rdquo; started Bill, &ldquo;I can&rsquo;t remember the number exactly. I do remember that we tried three different size boxes. When we used the largest box size we had 407 books remaining after filling all of the rest completely. When we tried the second largest box size we had 409 books left over, and when we tried the smallest box size we only had 17 books left over.&rdquo;</p>

<p>&ldquo;Okay,&rdquo; a slightly puzzled Fred continued, &ldquo;then just let me know the box sizes and the number of boxes you used.&rdquo;</p>

<p>&ldquo;Funny thing&rdquo; replied Bill, &ldquo;I can&rsquo;t remember that either. I do remember that the boxes were made from a 16 by 21 inch sheet of cardboard, with squares cut out at each of the four corners. We then folded the sides up to make an open top box, filled each box with books, then used packaging tape to attach a lid. The dimensions of each box were all integer multiples of inches.&rdquo;</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/17859.%E2%80%85Remainder%E2%80%85Reminder/4fa1b6a7.png" data-original-src="https://upload.acmicpc.net/b05a87e7-dc91-42a2-b667-e7b422cde1ee/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 319px; height: 133px;" /></p>

<p style="text-align: center;">Figure H.1: Example of folding a box.</p>

<p>&ldquo;You seem to have a very selective memory,&rdquo; a now aggravated Fred complained.</p>

<p>&ldquo;Well, if it helps, I know that the three different box sizes were the three largest possible to make from those sheets of cardboard. I also know that we had between 20, 000 and 30, 000 books to ship. I think that should give you enough to determine the total number of books.&rdquo;</p>

<p>&ldquo;So let me get this straight. You&rsquo;re giving me the dimensions of the sheets of cardboard, the fact that the box sizes are the three largest that can be made from them, the number of books left over after using each of the box sizes, and a range in which the number of books lies, correct?&rdquo; said Fred, rubbing his increasingly aching head.</p>

<p>&ldquo;That&rsquo;s it,&rdquo; confirmed Bill.</p>

<p>&ldquo;Sounds like some grossly convoluted computer programming problem!&rdquo;</p>

<p>&ldquo;Yeah. Go figure?&rdquo;</p>

### 입력

<p>Input consists of seven positive integers a b c d e f g, where a and b (a &le; b, 7 &le; a, b &le; 100) are the dimensions of the sheets of cardboard (in inches), c, d and e (1 &le; c, d, e &le; 10<sup>9</sup>) are the number of books left over for the three largest size boxes possible for the given size cardboard sheets (in order from largest box size to third largest box size) and f and g specify an inclusive range for the number of books (1 &le; f &lt; g &le; 10<sup>9</sup>).</p>

### 출력

<p>Output the number of books which satisfy all the conditions of the problem. Each problem is guaranteed to have a unique answer.</p>