Algorithm main()
    A ← [3, 1, 4, 1, 5, 9, 2, 6]
    result ← findMax(A)
    return result
end Algorithm

Algorithm findMax(A)
    max ← A[1]
    for i ← 2 to length(A) do
        if A[i] > max then
            max ← A[i]
        end if
    end for
    return max
end Algorithm
