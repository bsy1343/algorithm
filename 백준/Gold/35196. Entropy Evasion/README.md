# [Gold II] Entropy Evasion - 35196

[문제 링크](https://www.acmicpc.net/problem/35196)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 15, 정답: 5, 맞힌 사람: 5, 정답 비율: 33.333%

### 분류

그리디 알고리즘, 누적 합, 브루트포스 알고리즘, 수학, 최대 부분 배열 문제, 통계학, 확률론

### 문제 설명

<p>Last week, you were contacted by aliens. Strangely, no one you tell seems to believe you -- this is likely some form of alien brainwashing. Nonetheless, you decided to reply to the message, and with the help of a few video tutorials, a rocket with a picture of you and your cat is currently long underway to the aliens. Perhaps more importantly, the rocket also contains an array of $n$ bits, all set to $0$. This was specifically requested by the aliens: "State your intentions. Send an array of bits set to $1$ to indicate you wish to remain peaceful. In any other case, we will destroy your planet." Wait, what? Set to $1$? Whoops.</p>

<p>Luckily, the rocket is equipped with a Bit Array Protection Controller (BAPC). The BAPC can be opened up to expose a contiguous section of the bit array to interstellar radiation, independently setting each of the exposed bits to either $0$ or $1$, each with a probability of $50\%$. Your idea is to exploit this randomness to set most of the bits in the array to $1$. The aliens sounded serious, but not <em>that</em> serious, so setting at least $70\%$ of the bits to $1$ is probably fine. Unfortunately, the rocket has almost reached its destination, so you can open up the BAPC at most $125$ times before the aliens read the array. Send the correct commands to the BAPC to ensure at least $70\%$ of the bits are set to $1$.</p>

### 입력



### 출력

