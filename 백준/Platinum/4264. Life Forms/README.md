# [Platinum IV] Life Forms - 4264

[문제 링크](https://www.acmicpc.net/problem/4264)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 26, 정답: 11, 맞힌 사람: 8, 정답 비율: 34.783%

### 분류

문자열, 이분 탐색, 해싱

### 문제 설명

<p>You may have wondered why most extraterrestrial life forms resemble humans, differing by superficial traits such as height, colour, wrinkles, ears, eyebrows and the like. A few bear no human resemblance; these typically have geometric or amorphous shapes like cubes, oil slicks or clouds of dust.</p>

<p>The answer is given in the 146th episode of Star Trek - The Next Generation, titled The Chase. It turns out that in the vast majority of the quadrant&#39;s life forms ended up with a large fragment of common DNA.</p>

<p>Given the DNA sequences of several life forms represented as strings of letters, you are to find the longest substring that is shared by more than half of them.</p>

### 입력

<p>Standard input contains several test cases. Each test case begins with 1 &le; n &le; 100, the number of life forms. n lines follow; each contains a string of lower case letters representing the DNA sequence of a life form. Each DNA sequence contains at least one and not more than 1000 letters. A line containing 0 follows the last test case.</p>

### 출력

<p>For each test case, output the longest string or strings shared by more than half of the life forms. If there are many, output all of them in alphabetical order. If there is no solution with at least one letter, output &quot;?&quot;. Leave an empty line between test cases.</p>