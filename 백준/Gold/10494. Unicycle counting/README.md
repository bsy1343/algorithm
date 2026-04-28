# [Gold III] Unicycle counting - 10494

[문제 링크](https://www.acmicpc.net/problem/10494)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 103, 정답: 32, 맞힌 사람: 25, 정답 비율: 29.412%

### 분류

백트래킹

### 문제 설명

<p>Going to circus college is not as fun as you were led to believe. You are juggling so many classes. Trapeze class is sometimes up, sometimes down. There&rsquo;s a lot of tension in your high-wire class. And you&rsquo;ve seen that lion taming can be cat-astrophic.</p>

<p>The one pleasure you find is in riding unicycles with your fellow classmates. Many people have unicycles with different sized wheels. One day you notice that all their tires leave a small mark on the ground, once per rotation. You decide to amuse yourself and avoid your classwork by trying to determine how many unicycles have passed by on a given stretch of road. In fact, you want to know the minimum number of unique unicycles that could have left the marks you observe. You make the simplifying assumption that any unicycle riding on the road will ride completely from the beginning to the end.</p>

<p>The figures below illustrate the sample input. Each thick black vertical stripe represents a mark left by a tire.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/10494.%E2%80%85Unicycle%E2%80%85counting/830de45e.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/10494.%E2%80%85Unicycle%E2%80%85counting/830de45e.png" data-original-src="https://www.acmicpc.net/upload/images2/unicycle.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:191px; width:586px" /></p>

### 입력

<p>Each line of input represents the observations on a stretch of road. A line begins with two integers 1 &le; m &le; 100 and 1 &le; n &le; 10, where m represents the length of the road and n represents the number of marks you observe on the road. These are followed by n unique integers a<sub>1</sub>, a<sub>2</sub>, . . . , a<sub>n</sub>, where 0 &le; a<sub>i</sub> &lt; m for all a<sub>i</sub>. These n integers represent the positions where you observed a unicycle&rsquo;s tire has left a mark. There will be at most 100 lines of input. Input ends at end of file.</p>

### 출력

<p>For each set of observations, print the minimum number of unicycles that could have produced the observed marks.</p>