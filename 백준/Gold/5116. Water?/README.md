# [Gold II] Water? - 5116

[문제 링크](https://www.acmicpc.net/problem/5116)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 96, 정답: 30, 맞힌 사람: 25, 정답 비율: 29.762%

### 분류

브루트포스 알고리즘, 누적 합

### 문제 설명

<p>One of the main goals in sending Curiosity to Mars is to search for more evidence that Mars may have had water on its surface in the past, or perhaps even in the present? To figure out whether there was water, scientists use various clues from images, such as rust and other evidence of oxidation. In this question, you are to explore pictures of Mars surface, and find evidence of water in them if it exists.</p>

<p>Each picture will be given to you as a rectangle of h &times; w pixels, with 1 &le; h,w &le; 50. Each pixel may be indicative of different types of material, which will be denoted by a letter from the upper-case alphabet &lsquo;A&rsquo;&ndash;&lsquo;Z&rsquo;. (No other values will occur.) Some of these letters will be marked as special, in that they indicate a clue for water. You will be given a minimum size 1 &le; m &le; min(h,w), and are to find the largest density of special letters in any subrectangle of size at least m &times; m.</p>

### 입력

<p>The first line is the number K of input data sets, followed by the K data sets, each of the following form:</p>

<p>The first line contains three integers h,w,m, the height of the image, the width of the image, and the minimum rectangle size.</p>

<p>Next is a line with a string of 1&ndash;26 letters from &lsquo;A&rsquo;&ndash;&lsquo;Z&rsquo;, with no repetitions (but not necessarily sorted). These are the special, water-indicating letters.</p>

<p>This is followed by h lines, each consisting of w upper-case letters (and nothing else), each describing one row of the image.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. On the next line, output the maximum density of water-indicating pixels in any m &times; m or larger rectangle. This should be output as a fraction x/y, where x is the number of water-indicating pixels, and y is the number of total pixels in the maximizing rectangle. If there are multiple rectangles of different sizes giving the same ratio, then output the ratio with the largest number y of pixels in the rectangle. Each data set should be followed by a blank line.</p>