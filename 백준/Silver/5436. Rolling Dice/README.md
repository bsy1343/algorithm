# [Silver I] Rolling Dice - 5436

[문제 링크](https://www.acmicpc.net/problem/5436)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 28, 정답: 14, 맞힌 사람: 13, 정답 비율: 76.471%

### 분류

구현

### 문제 설명

<p>A clan of ninjas have hit upon a strange map: it is divided into squares of size 0.5 by 0.5 inch approximately. Somewhere in the middle, on a spot known to be a foothold of pirates, the square is denoted by 1, while the adjacent squares from north to west bear the numbers 2, 3, 5, and 4, respectively. This strange numbering puzzled the ninjas for a long time until the brightest gambler among them discovered that it had something to do with dice: if the top shows 1, and you roll &ndash; or rather tilt &ndash; the die to the right onto the neighboring square, then 3 appears on top (depending of course on the orientation of the die.) Together with the map, they laid their hands on a strange text first attributed to the Bay Area Poets Coalition, but it seemed unlikely that even Joyce concocted such a hermetic verse.</p>

<p>The first sentence reads &ldquo;5X-YYX+Y.&rdquo;. They found out what it means:</p>

<ul>
	<li>X means one square to the east.</li>
	<li>Y means one square to the north.</li>
	<li>3X is an abbreviation for XXX, and 3XYX means XXXYX.</li>
</ul>

<p>The minus sign means that the directions are reversed (east becomes west and north becomes south), the plus sign restores the original directions. The sequence ends with a dot &rsquo;.&rsquo;. The number of dots on the top of the die in its final position signifies what is to find on this spot: a hut, a hiding place for weapons, a well, or even a place of unspeakable horror.</p>

<p>Your task is to compute the coordinates of the final position (relative to the starting point) and to determine what number of dots is shown on the top.</p>

### 입력

<p>The first line of the input contains a single number: the number of test cases to follow. Each test case has the following format:</p>

<ul>
	<li>A single line with a string describing a sequence.</li>
</ul>

<p>A sequence can contain digits, &rsquo;+&rsquo;, &rsquo;-&rsquo;, &rsquo;X&rsquo;, &rsquo;Y&rsquo;, and ends with a dot. A sequence contains at most 1000 characters. The numbers in the sequence consist of at most 7 digits and are never zero.</p>

### 출력

<p>For every test case in the input, the output should be a single line containing &ldquo;position (x, y), z dots&rdquo;, where (x, y) is the final position of the die and z the number of dots shown on top of the die in the final position.</p>