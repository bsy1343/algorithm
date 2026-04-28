# [Platinum IV] Bouncing Bunnies - 25903

[문제 링크](https://www.acmicpc.net/problem/25903)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 1024 MB

### 통계

제출: 32, 정답: 18, 맞힌 사람: 16, 정답 비율: 57.143%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>Connie and Ronnie, the bouncing bunnies, enjoy frolicking in the hills. They are both very adventurous and seek extreme weather changes. Connie loves changes in the temperature, so when she bounces from one hill to another, her happiness during that bounce is equal to |T<sub>A</sub> &ndash; T<sub>B</sub>|, where T<sub>A</sub> is the temperature of the hill she jumped from, in bunny-degrees, and T<sub>B</sub> is the temperature of the hill she jumped to, also in bunny-degrees. On the other hand, Ronnie loves changes in humidity, so when she bounces from one hill to another, her happiness during that bounce is equal to |H<sub>A</sub> &ndash; H<sub>B</sub>|, where H<sub>A</sub> is the humidity of the hill she jumped from, in bunny humidity units, and H<sub>B</sub> is the humidity of the hill she jumped to, also in bunny humidity units.</p>

<p>Connie and Ronnie are good friends, and would like to travel together across a field full of hills (starting at their home and ending at their favorite tree), but in order to relate to each other as well as possible, they would like Connie&rsquo;s happiness level to be equal to Ronnie&rsquo;s during every bounce (jump) they make.</p>

<p>Given the weather data for a field of hills, determine the minimum number of jumps needed for Connie and Ronnie to get from their home to their favorite tree. Bunnies are so good at bouncing that they can jump from any hill to any other hill, i.e., any hill is within a single bounce&rsquo;s distance of any other hill.</p>

### 입력

<p>The first input line contains a positive integer, t, indicating the number of fields to process. The description of each field will start (on a new line) with a positive integer, n (2 &le; n &le; 500,000), denoting the number of hills in the field. The following input line will contain n positive integers &ndash; the i th number on this line, T<sub>i</sub> (1 &le; T<sub>i</sub> &le; 10<sup>9</sup>), will denote the temperature of the i th hill in bunny degrees. The next input line (the last line of each field description) will consist of n positive integers &ndash; the i th number on this line, H<sub>i</sub> (1 &le; H<sub>i</sub> &le; 10<sup>9</sup>), will denote the humidity of the i th hill in bunny humidity units. The bunnies&rsquo; home is located on hill 1, and their favorite tree is located on hill n.</p>

### 출력

<p>For each field, output must consist of a single line of the following form: &ldquo;Field #f: b&rdquo;, where f is the field number in the input starting from 1 and b is an integer &ndash; the minimum number of bounces (jumps) needed for Connie and Ronnie to get from their home to their favorite tree, or the number -1 if such a journey cannot be made by the pair of bunnies. Leave a blank line after the output for each field.</p>