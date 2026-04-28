# [Platinum IV] 기숙사 비밀번호 구하기 - 31435

[문제 링크](https://www.acmicpc.net/problem/31435)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 592, 정답: 131, 맞힌 사람: 101, 정답 비율: 26.031%

### 분류

수학, 애드 혹, 정수론, 해 구성하기, 선형대수학, 모듈로 곱셈 역원, 차분 공격

### 문제 설명

<p>이 문제는 <strong>인터랙티브</strong> 문제이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/31435.%E2%80%85%EA%B8%B0%EC%88%99%EC%82%AC%E2%80%85%EB%B9%84%EB%B0%80%EB%B2%88%ED%98%B8%E2%80%85%EA%B5%AC%ED%95%98%EA%B8%B0/7aa27f16.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/31435.%E2%80%85%EA%B8%B0%EC%88%99%EC%82%AC%E2%80%85%EB%B9%84%EB%B0%80%EB%B2%88%ED%98%B8%E2%80%85%EA%B5%AC%ED%95%98%EA%B8%B0/7aa27f16.png" data-original-src="https://upload.acmicpc.net/216686e3-9a60-4d29-ac8c-aa3f44a59255/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 768px; height: 567px;" /></p>

<p>한별이와 우빈이는 같은 기숙사 방을 배정받게 되었다. 그런데 한별이와 같은 방을 쓰기 부끄러웠던 우빈이는 한별이가 들어오기 전 문에다가 비밀번호 장치를 설치해 버렸다. 장치를 풀기 위해선 $0 \leq x_{i} &lt; 998\,244\,353$를 만족하는 $N$개의 정수 $x_{1},x_{2},\cdots,x_{N}$를 알아내야 한다. 그러나 츤데레인 우빈이는 한별이의 프로그래밍 실력이 뛰어난지 알아보기 위하여 다음의 함수를 제공하였다. 한별이는 $N$개의 원하는 정수 $a_{1},a_{2},\cdots,a_{N}$을 골라 그 함숫값 $f(a_{1},a_{2},\cdots,a_{N})$을 알아낼 수 있다.</p>

<p>$0$ 이상 $998\,244\,353$ 미만의 정수들의 집합을 $\mathbb{M}$이라고 할 때, 함수 $f: {\overbrace{\mathbb M \times \mathbb M \times \cdots \times \mathbb M}^{N\text{ times}}} \rightarrow \mathbb{M}$은 다음과 같이 정의된다: $$f(a_{1},a_{2},\cdots,a_{N})=(a_{1}x_{1}+a_{2}x_{2}+\cdots+a_{N}x_{N}) \bmod 998\,244\,353$$</p>

<p>단, 함수는 최대 $N$번만 사용할 수 있으며, 모든 함수 사용을 통틀어서 $a_{1}, a_{2}, \ldots, a_{N}$는 전부 달라야 한다. 즉, 함수를 $k$번 사용했다면 $kN$개의 인자가 모두 달라야 한다.</p>

<p>이제 비밀번호를 구하여 우빈이를 놀래켜 보자.</p>

### 입력



### 출력



### 제한

<ul>
	<li>$2 \leq N \leq 2500$</li>
</ul>

### 힌트

<p>당신의 프로그램은 무언가를 출력한 후 즉시 출력 버퍼를 비워야 한다. 다음은 언어별 출력 버퍼를 비우는 방법이다.</p>

<ul>
	<li>C &mdash; <span style="color:#e74c3c;"><code>fflush(stdout)</code></span></li>
	<li>C++ &mdash; <span style="color:#e74c3c;"><code>std::cout.flush()</code></span></li>
	<li>Python &mdash; <span style="color:#e74c3c;"><code>sys.stdout.flush()</code></span></li>
	<li>Java &mdash; <span style="color:#e74c3c;"><code>System.out.flush()</code></span></li>
	<li>그 외의 언어는 각 언어의 Documentation을 참고한다.</li>
</ul>

<p>또한, 예제의 빈 줄은 입출력이 어떤 방식으로 이루어지는지 이해를 돕기 위해 의도적으로 추가된 것이며, 실제 입출력에는 빈 줄이 나타나지 않는다.</p>