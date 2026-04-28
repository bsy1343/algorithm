# [Bronze V] 코딩은 체육과목 입니다 - 25314

[문제 링크](https://www.acmicpc.net/problem/25314)

### 성능 요약

시간 제한: 0.5 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 149414, 정답: 94073, 맞힌 사람: 83461, 정답 비율: 63.325%

### 분류

구현

### 문제 설명

<p style="margin-bottom: 15px;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/25314.%E2%80%85%EC%BD%94%EB%94%A9%EC%9D%80%E2%80%85%EC%B2%B4%EC%9C%A1%EA%B3%BC%EB%AA%A9%E2%80%85%EC%9E%85%EB%8B%88%EB%8B%A4/090462be.png" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/25314.%E2%80%85%EC%BD%94%EB%94%A9%EC%9D%80%E2%80%85%EC%B2%B4%EC%9C%A1%EA%B3%BC%EB%AA%A9%E2%80%85%EC%9E%85%EB%8B%88%EB%8B%A4/090462be.png" data-original-src="https://u.acmicpc.net/ccbbee06-7e6f-4e56-bb9f-9a1abd795508/long-long-long-img1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="display: block; margin-left: auto; margin-right: auto; width: 100%; max-width: 400px;" /></p>

<p>오늘은 혜아의 면접 날이다. 면접 준비를 열심히 해서 앞선 질문들을 잘 대답한 혜아는 이제 마지막으로 칠판에 직접 코딩하는 문제를 받았다. 혜아가 받은 문제는 두 수를 더하는 문제였다. C++ 책을 열심히 읽었던 혜아는 간단히 두 수를 더하는 코드를 칠판에 적었다. 코드를 본 면접관은 다음 질문을 했다. &ldquo;만약, 입출력이 $N$바이트 크기의 정수라면 프로그램을 어떻게 구현해야 할까요?&rdquo;</p>

<p>혜아는 책에 있는 정수 자료형과 관련된 내용을 기억해 냈다. 책에는 <span style="color:#e74c3c;"><code>long int</code></span>는 $4$바이트 정수까지 저장할 수 있는 정수 자료형이고 <span style="color:#e74c3c;"><code>long long int</code></span>는 $8$바이트 정수까지 저장할 수 있는 정수 자료형이라고 적혀 있었다. 혜아는 이런 생각이 들었다. &ldquo;<span style="color:#e74c3c;"><code>int</code></span> 앞에 <span style="color:#e74c3c;"><code>long</code></span>을 하나씩 더 붙일 때마다 $4$바이트씩 저장할 수 있는 공간이 늘어나는 걸까? 분명 <span style="color:#e74c3c;"><code>long long long int</code></span>는 $12$바이트, <span style="color:#e74c3c;"><code>long long long long int</code></span>는 $16$바이트까지 저장할 수 있는 정수 자료형일 거야!&rdquo; 그렇게 혜아는 당황하는 면접관의 얼굴을 뒤로한 채 칠판에 정수 자료형을 써 내려가기 시작했다.</p>

<p>혜아가 $N$바이트 정수까지 저장할 수 있다고 생각해서 칠판에 쓴 정수 자료형의 이름은 무엇일까?</p>

### 입력

<p>첫 번째 줄에는 문제의 정수 $N$이 주어진다. $(4\le N\le 1\, 000$; $N$은 $4$의 배수$)$</p>

### 출력

<p>혜아가 $N$바이트 정수까지 저장할 수 있다고 생각하는 정수 자료형의 이름을 출력하여라.</p>

### 힌트

<p>출력에서 <span style="color:#e74c3c;"><code>long</code></span>과 <span style="color:#e74c3c;"><code>long</code></span>, <span style="color:#e74c3c;"><code>long</code></span>과 <span style="color:#e74c3c;"><code>int</code></span> 사이에는 공백이 하나씩 들어간다.</p>

<p>실제로 C++에서 각 정수 자료형이 저장할 수 있는 수의 크기는 환경에 따라 달라질 수 있다. 덧붙여, 실제로 문제 내용과 같이 <span style="color:#e74c3c;"><code>long long long int</code></span>와 같은 자료형을 사용한 코드를 GCC의 C++ 컴파일러를 사용해 컴파일하려고 할 경우 <code>&#39;long long long&#39; is too long for GCC</code>라는 에러 메시지와 함께 컴파일되지 않는다.</p>