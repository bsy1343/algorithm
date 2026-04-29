# [Gold III] Millikan's Oil Droplet Experiment - 6952

[문제 링크](https://www.acmicpc.net/problem/6952)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 4, 정답: 2, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

그리디 알고리즘

### 문제 설명

<p>Millikan&#39;s famous Oil Droplet Experiment showed that electrical charge is quantized; that is that the electrical charge on any object is the sum of a number of elementary electrical charges. The electron is the most common subatomic particle that carries a single elementary electrical charge.</p>

<p>Millikan&#39;s experiment involved measuring the charge on several oil droplets, and showing that each charge was a multiple of some smaller charge. Your friend, the physics enthusiast, has to reproduce Millikan&#39;s experiment. She has looked after constructing the apparatus and taking the measurements. Her measurements are pretty good for what can be achieved in a high school laboratory: the maximum error on any given measurement is $\pm 1\%$.</p>

<p>Given the measurements as input, your program must find the maximum possible value for the elementary charge consistent with the measurements. That is, each measurement, plus or minus an error of $1\%$ or less, must be a multiple of the elementary charge.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/6952.%E2%80%85Millikan's%E2%80%85Oil%E2%80%85Droplet%E2%80%85Experiment/aae4239c.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/6952.%E2%80%85Millikan's%E2%80%85Oil%E2%80%85Droplet%E2%80%85Experiment/b639ea5f.jpg" data-original-src="https://boja.mercury.kr/assets/problem/6952-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

### 입력

<p>The input contains an integer $n$ $(1 \le n \le 100)$, the number of oil droplets. This is followed by $n$ real numbers on a single line; these represent the charge measured on each droplet.</p>

### 출력

<p>The output should be a single number, the maximum possible elementary charge, correct to $4$ decimal places.</p>